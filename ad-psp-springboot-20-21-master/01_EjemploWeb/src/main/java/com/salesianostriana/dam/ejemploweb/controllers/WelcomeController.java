package com.salesianostriana.dam.ejemploweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("mensaje", "Los alumnos de 2º DAM no se acuerdan del curso pasado");
        return "index";
    }


    @GetMapping("/date")
    public String dameLaHora(Model model) {
        model.addAttribute("fecha", LocalDateTime.now());
        return "fecha";
    }

}
