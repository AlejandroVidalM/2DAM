package com.salesianostriana.dam.springdata.services;

import com.salesianostriana.dam.springdata.model.Producto;
import com.salesianostriana.dam.springdata.repos.ProductoRepositorio;
import com.salesianostriana.dam.springdata.services.base.ServicioBase;
import com.salesianostriana.dam.springdata.services.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicio extends
        ServicioBaseImpl<Producto, Long, ProductoRepositorio> {

    public List<Producto> todosLosProductosConElNombreEnMayusculas() {
        return this.findAll().stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                }).collect(Collectors.toUnmodifiableList());
    }


}
