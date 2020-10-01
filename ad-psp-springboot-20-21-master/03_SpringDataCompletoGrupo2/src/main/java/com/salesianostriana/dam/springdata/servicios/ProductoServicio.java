package com.salesianostriana.dam.springdata.servicios;

import com.salesianostriana.dam.springdata.modelo.Producto;
import com.salesianostriana.dam.springdata.repos.ProductoRepositorio;
import com.salesianostriana.dam.springdata.servicios.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicio
        extends ServicioBaseImpl<Producto, Long, ProductoRepositorio> {

    public List<Producto> todosLosProductosConElNombreEnMayusculas() {
        return this.findAll().stream()
                        .map(p -> {
                            return Producto.builder()
                                    .id(p.getId())
                                    .nombre(p.getNombre().toUpperCase())
                                    .precio(p.getPrecio())
                                    .build();
                        }).collect(Collectors.toList());
    }


}
