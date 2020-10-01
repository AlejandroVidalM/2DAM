package com.salesianostriana.dam.springdatajpa;

import com.salesianostriana.dam.springdatajpa.dao.AlumnoRepositorio;
import com.salesianostriana.dam.springdatajpa.model.Alumno;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner init(AlumnoRepositorio alumnoRepositorio) {
		return args -> {
			Alumno a = Alumno.builder()
					.nombre("Luismi")
					.apellidos("López Magaña")
					.email("luismi.lopez@salesianos.edu")
					.build();


			Alumno b = new Alumno();

			alumnoRepositorio.save(a);
			


		};
	}



}
