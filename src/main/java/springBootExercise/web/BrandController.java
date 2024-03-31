package springBootExercise.web;

// 1


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springBootExercise.service.BrandService;

@Controller
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/all")
    public String allBrands(Model model) {
        model.addAttribute("brands", brandService.getAllBrands());
        return "brands";
    }
}
