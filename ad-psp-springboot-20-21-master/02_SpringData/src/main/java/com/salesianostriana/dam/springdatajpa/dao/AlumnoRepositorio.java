package com.salesianostriana.dam.springdatajpa.dao;

import com.salesianostriana.dam.springdatajpa.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio
        extends JpaRepository<Alumno, Long> {
}

