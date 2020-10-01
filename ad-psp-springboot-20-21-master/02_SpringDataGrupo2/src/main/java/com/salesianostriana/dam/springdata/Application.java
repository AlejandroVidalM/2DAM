package com.salesianostriana.dam.springdata;

import com.salesianostriana.dam.springdata.model.Alumno;
import com.salesianostriana.dam.springdata.model.AlumnoRepositorio;
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
	public CommandLineRunner init(AlumnoRepositorio repo) {
		return args -> {

			Alumno a = Alumno.builder()
						.nombre("Luis Miguel")
						.apellidos("López Magaña")
						.direccion("C/ Condes de Bustillo 17")
						.poblacion("Sevilla")
						.provincia("Sevilla")
					.build();

			repo.save(a);

		};
	}


}
