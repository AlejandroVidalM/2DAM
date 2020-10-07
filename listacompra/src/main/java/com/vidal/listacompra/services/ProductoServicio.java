package com.vidal.listacompra.services;

import com.vidal.listacompra.model.Producto;
import com.vidal.listacompra.repository.ProductoRepositorio;
import com.vidal.listacompra.services.base.ServicioBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepositorio> {

    public List<Producto> todosLosProductos() {
        return this.findAll().stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                }).collect(Collectors.toUnmodifiableList());
    }
}
