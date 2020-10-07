package com.vidal.listacompra.controller;

import com.vidal.listacompra.model.Producto;
import com.vidal.listacompra.services.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("lista", productoServicio.todosLosProductos());
        return "producto/index";

    }

    @GetMapping("/new")
    public String showFormNewProduct(Model model){
        model.addAttribute("producto", new Producto());
        return "producto/formulario";
    }

    @PostMapping("/submit")
    public String submitNewProduct(
            @ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "redirect:/producto/";
    }

}
