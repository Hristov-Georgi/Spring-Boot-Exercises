package springBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springBootExercise.model.entities.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
