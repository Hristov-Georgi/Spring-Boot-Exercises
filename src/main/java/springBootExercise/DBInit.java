package springBootExercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springBootExercise.model.entities.Model;
import springBootExercise.model.entities.Offer;
import springBootExercise.model.enums.Engine;
import springBootExercise.model.enums.Transmission;
import springBootExercise.repository.BrandRepository;
import springBootExercise.repository.ModelRepository;
import springBootExercise.repository.OfferRepository;

import java.math.BigDecimal;
import java.time.Year;


@Component
public class DBInit implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;
    private final OfferRepository offerRepository;

    public DBInit(BrandRepository brandRepository, ModelRepository modelRepository,
                  OfferRepository offerRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
        this.offerRepository = offerRepository;

    }

    @Override
    public void run(String... args) throws Exception {

// Populate Database with brands and models
        //populate DB with offers

//
//        Offer offer = new Offer();
//        offer.setName("Hot car sale");
//        offer.setDescription("Best car in the universe");
//        offer.setEngine(Engine.GASOLINE);
//        offer.setMileage(10000);
//        offer.setYear(Year.of(2022));
//        offer.setCreated();
//        offer.setModel( this.modelRepository.findById(2L).get());
//        offer.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg/275px-2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg");
//        offer.setPrice(BigDecimal.valueOf(30000));
//        offer.setTransmission(Transmission.AUTOMATIC);
//        offer.setSeller(null);
//
//        this.offerRepository.save(offer);


    }
}
