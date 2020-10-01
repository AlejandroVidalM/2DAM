package com.salesianostriana.dam.springdata.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio
    extends JpaRepository<Alumno, Long> {
}
