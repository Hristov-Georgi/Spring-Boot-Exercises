package springBootExercise.service;

public interface UserService {

    boolean authenticate(String username, String password);

    void loggedUser(String username);
}
