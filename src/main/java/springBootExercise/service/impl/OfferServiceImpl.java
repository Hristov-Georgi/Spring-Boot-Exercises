package springBootExercise.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springBootExercise.model.entities.Offer;
import springBootExercise.model.view.OfferDetailsView;
import springBootExercise.model.view.OfferSummaryView;
import springBootExercise.repository.OfferRepository;
import springBootExercise.service.OfferService;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;

    }


    @Override
    public List<OfferSummaryView> getAllOffers() {

        List<Offer> offerList = this.offerRepository.findAll();

        return offerList.stream()
                .map(o -> this.modelMapper.map(o, OfferSummaryView.class))
                .toList();

    }

    @Override
    public List<OfferDetailsView> getDetailOffers() {

        List<Offer> offerList = this.offerRepository.findAll();


        return offerList.stream()
                .map(o -> this.modelMapper.map(o, OfferDetailsView.class))
                .toList();

    }
}
