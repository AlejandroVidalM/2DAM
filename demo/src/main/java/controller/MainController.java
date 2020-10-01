package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MainController {

    /*public String nombreDelMetodo(){

        return "index";
        // return "/src/main/resources/template/index.html
        // return "/src/main/resources/template/?????.html
    }*/
    @GetMapping("/")
    public String welcome(Model model){
        //model.addAttribute("mensaje","test");
        model.addAttribute("mensaje", "mensaje de prueba");
        return "index";
    }
    @GetMapping("/")
    public String now(Model model){
        model.addAttribute("ahora", LocalDateTime.now());
        //model.addAttribute("ahora", LocalDateTime.now());
        return"Hora";
    }
   /* public String welcome(Model model){
        model.addAttribute("mensaje","Los alumnos de 2º DAM de hoy están un poco empanados");
        return "index";
    }*/

}
