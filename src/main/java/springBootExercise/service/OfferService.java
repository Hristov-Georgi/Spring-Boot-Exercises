package springBootExercise.service;


import springBootExercise.model.view.OfferDetailsView;
import springBootExercise.model.view.OfferSummaryView;

import java.util.List;

public interface OfferService {

    List<OfferSummaryView> getAllOffers();

    List<OfferDetailsView> getDetailOffers();
}
