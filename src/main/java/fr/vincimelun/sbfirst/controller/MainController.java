package fr.vincimelun.sbfirst.controller;

import fr.vincimelun.sbfirst.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/identite")
    public String identity(Model model){
        model.addAttribute("name","Gaston");
        model.addAttribute("job","Gaffeur professionnel");
        return "identity";
    }
    @GetMapping("/personne")
    public String personForm(){
        return "personform";
    }
    @PostMapping("/personne")
    public String personDisplay(
            @ModelAttribute Person person,Model model){
        // ajouter du code pour recupérer les données
        model.addAttribute("persondisplay",person);
        return "persondisplay";
    }
}
