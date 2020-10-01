package com.vidal.ejemploJPA.controladores;

import com.vidal.ejemploJPA.servicios.ProductoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("lista", productoServicio)//sin terminar
        return "index";
    }
}
