package springBootExercise.service;

import springBootExercise.model.view.BrandView;

import java.util.List;

public interface BrandService {

    List<BrandView> getAllBrands();
}
