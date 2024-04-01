package springBootExercise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springBootExercise.service.OfferService;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/all")
    public String getAllOffers(Model model) {

        model.addAttribute("offers", this.offerService.getAllOffers());

        return "offers";
    }

    @GetMapping("/details")
    public String getDetailsOffers(Model model) {

        model.addAttribute("details", this.offerService.getDetailOffers());

        return "details";
    }


}
