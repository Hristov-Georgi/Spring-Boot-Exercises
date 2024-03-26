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
}
