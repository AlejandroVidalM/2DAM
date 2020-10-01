package com.salesianostriana.dam.springdata.repos;

import com.salesianostriana.dam.springdata.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio
        extends JpaRepository<Producto, Long> {
}
