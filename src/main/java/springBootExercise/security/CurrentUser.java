package springBootExercise.security;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import springBootExercise.model.entities.UserRole;
import springBootExercise.model.enums.Role;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class CurrentUser {
    private static final String ANONYMOUS = "Anonymous";

    private String name = ANONYMOUS;
    private boolean isAnonymous = true;
    private List<Role> userRoles = new ArrayList<>();

    public String getName() {
        return name;
    }

    public CurrentUser() {
    }

    public void setUserRoles(List<Role> newUserRoles) {
        this.userRoles.clear();
        this.userRoles.addAll(newUserRoles);
    }

    public boolean isAdmin() {
        return userRoles.contains(Role.ADMIN);
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public boolean isLoggedIn() {
        return !isAnonymous();
    }

    public void setAnonymous(boolean anonymous) {
        if(anonymous) {
            this.name = ANONYMOUS;
            this.userRoles.clear();
        }
        isAnonymous = anonymous;
    }
}
