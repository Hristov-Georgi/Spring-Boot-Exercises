package springBootExercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springBootExercise.model.serviceModel.UserLoginServiceModel;
import springBootExercise.repository.UserRepository;
import springBootExercise.security.CurrentUser;
import springBootExercise.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {

        return "auth-register";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(UserLoginServiceModel userLoginServiceModel) {

        if(this.userService.authenticate(userLoginServiceModel.getUsername(), userLoginServiceModel.getPassword())) {
            this.userService.loggedUser(userLoginServiceModel.getUsername());
            return "redirect:/";
        }

        return "redirect:/login";
    }

    @PostMapping("/logout")
    public String logout() {
        this.userService.logoutCurrentUser();
        return "redirect:/";
    }
}
