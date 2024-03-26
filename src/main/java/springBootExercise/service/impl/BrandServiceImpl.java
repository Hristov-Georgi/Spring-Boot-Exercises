package springBootExercise.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootExercise.model.entities.Brand;
import springBootExercise.model.entities.Model;
import springBootExercise.model.view.BrandView;
import springBootExercise.model.view.ModelView;
import springBootExercise.repository.BrandRepository;
import springBootExercise.repository.ModelRepository;
import springBootExercise.service.BrandService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository, ModelRepository modelRepository,
                            ModelMapper modelMapper) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BrandView> getAllBrands() {

        List<BrandView> brandViews = new ArrayList<>();

        List<Model> brands = this.modelRepository.findAll();

        brands
                .stream()
                .forEach(model -> {
                    Brand brand = model.getBrand();

                    Optional<BrandView> brandViewOptional = findByName(brandViews, brand.getName());

                    if(brandViewOptional.isEmpty()) {

                        BrandView newBrandView = new BrandView();
                        this.modelMapper.map(brand, newBrandView);
                        brandViews.add(newBrandView);

                        brandViewOptional = Optional.of(newBrandView);
                    }

                    ModelView newModelView = new ModelView();
                    this.modelMapper.map(model, newModelView);
                    brandViewOptional.get().addModel(newModelView);
                });


        return brandViews;
    }

    private static Optional<BrandView> findByName(List<BrandView> allModels, String name) {

        return allModels
                .stream()
                .filter(m -> m.getName().equals(name)).findAny();
    }
}
