package model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Aplication {

    @Bean
    public CommandLineRunner init(AlumnoRepositorio repo){
        return args -> {

            Alumno a = Alumno.builder()
                    .nombre("Alejandro")
                    .apellidos("Vidal")
                    .direccion("Mi casa")
                    .poblacion("Los Palacios")
                    .provincia("Sevilla")
                    .build();
            repo.save(a);

        };
    }
}
