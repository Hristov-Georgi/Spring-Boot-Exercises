package springBootExercise.model.entities;

import jakarta.persistence.*;
import springBootExercise.model.enums.Role;

@Entity
@Table(name = "roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

    public UserRole(Role role) {
        this.role = role;
    }

    public UserRole() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
