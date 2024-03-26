package springBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBootExercise.model.entities.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
}
