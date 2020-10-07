package com.vidal.listacompra.repository;

import com.vidal.listacompra.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio  extends JpaRepository<Producto, Long> {
}
