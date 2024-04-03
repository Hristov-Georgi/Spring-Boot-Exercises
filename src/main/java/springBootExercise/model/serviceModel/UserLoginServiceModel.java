package springBootExercise.model.serviceModel;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLoginServiceModel {

    @NotNull
    @Size(min = 2)
    private String username;

    @NotNull
    @Size(min = 2)
    private String password;

    public UserLoginServiceModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
