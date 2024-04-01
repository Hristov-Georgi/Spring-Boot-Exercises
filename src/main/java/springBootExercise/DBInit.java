package springBootExercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import springBootExercise.model.entities.User;
import springBootExercise.model.entities.UserRole;
import springBootExercise.model.enums.Role;
import springBootExercise.repository.*;


@Component
public class DBInit implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;
    private final OfferRepository offerRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public DBInit(BrandRepository brandRepository, ModelRepository modelRepository,
                  OfferRepository offerRepository, PasswordEncoder passwordEncoder, UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
        this.offerRepository = offerRepository;

        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
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

//        UserRole userRole = new UserRole(Role.USER);
//        UserRole adminRole = new UserRole(Role.ADMIN);
//
//        this.userRoleRepository.save(userRole);
//        this.userRoleRepository.save(adminRole);


//        User user = new User();
//        user.setUserRole(this.userRoleRepository.findById(2L).get());
//        user.setCreated();
//        user.setFirstName("Ivan");
//        user.setLastName("Petrov");
//        user.setPassword(passwordEncoder.encode("secretpassword"));
//        user.setUsername("admin");
//
//        userRepository.save(user);


    }
}
