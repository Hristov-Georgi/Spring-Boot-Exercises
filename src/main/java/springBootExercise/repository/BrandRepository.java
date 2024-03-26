package springBootExercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBootExercise.model.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
