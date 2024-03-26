package springBootExercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springBootExercise.model.entities.Brand;
import springBootExercise.model.entities.Model;
import springBootExercise.model.enums.VehicleCategory;
import springBootExercise.repository.BrandRepository;
import springBootExercise.repository.ModelRepository;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@Component
public class DBInit implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    public DBInit(BrandRepository brandRepository, ModelRepository modelRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;

    }

    @Override
    public void run(String... args) throws Exception {

// Populate Database with brands and models

    }
}
