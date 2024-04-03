package springBootExercise.web;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springBootExercise.model.serviceModel.UserLoginServiceModel;
import springBootExercise.repository.UserRepository;
import springBootExercise.security.CurrentUser;
import springBootExercise.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute
    public UserLoginServiceModel userLoginServiceModel() {
        return new UserLoginServiceModel();
    }

    @GetMapping("/register")
    public String register() {

        return "auth-register";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute UserLoginServiceModel userLoginServiceModel,
                        BindingResult bindingResult,
                        RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userLoginServiceModel", userLoginServiceModel);
            redirectAttributes
                    .addFlashAttribute("org.springframework.validation.BindingResult.userLoginServiceModel",
                            bindingResult);
            return "redirect:/users/login";
        }

        if(this.userService.authenticate(userLoginServiceModel.getUsername(), userLoginServiceModel.getPassword())) {
            this.userService.loggedUser(userLoginServiceModel.getUsername());
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("userLoginServiceModel", userLoginServiceModel);
            redirectAttributes.addFlashAttribute("notFound", true);
            return "redirect:/users/login";
        }


    }

    @PostMapping("/logout")
    public String logout() {
        this.userService.logoutCurrentUser();
        return "redirect:/";
    }
}
