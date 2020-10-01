package com.vidal.ejemploJPA.servicios;

import com.vidal.ejemploJPA.modelos.Producto;
import com.vidal.ejemploJPA.repositorios.ProductoRepositorio;
import com.vidal.ejemploJPA.servicios.base.ServicioBaseImpl;

import java.util.List;

public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepositorio> {
    public List<Producto> todosLosProductosEnMayusculas(){
        return this.findAll().stream()
                        .map(p ->{
                            return Producto.builder()
                                    .id(p.getId())
                                    .id(p.getNombre().toUpperCase())
                                    .precio((p.getPrecio())
                                    .build());
                        }).collect(collerctors.toList());
    }
}
