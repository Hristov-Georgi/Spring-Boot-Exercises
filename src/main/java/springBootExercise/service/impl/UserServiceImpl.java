package springBootExercise.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import springBootExercise.model.entities.User;
import springBootExercise.repository.UserRepository;
import springBootExercise.security.CurrentUser;
import springBootExercise.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }

    @Override
    public boolean authenticate(String username, String password) {

        Optional<User> userEntity = userRepository.findByUsername(username);

        if(userEntity.isEmpty()) {
            return false;
        } else {
            return passwordEncoder.matches(password, userEntity.get().getPassword());
        }

    }

    @Override
    public void loggedUser(String username) {
        this.currentUser.setAnonymous(false);
        this.currentUser.setName(username);
    }
}
