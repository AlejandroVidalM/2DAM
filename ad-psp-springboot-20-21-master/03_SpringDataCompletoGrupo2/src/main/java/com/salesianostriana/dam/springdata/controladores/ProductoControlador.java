package com.salesianostriana.dam.springdata.controladores;

import com.salesianostriana.dam.springdata.servicios.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("lista", productoServicio.todosLosProductosConElNombreEnMayusculas());
        return "index";
    }

}
