package com.cafeteria.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punto de entrada de la aplicación Spring Boot.
 * Cuando se ejecuta, Spring Boot levanta el servidor y expone los endpoints REST definidos en el proyecto.
 */
@SpringBootApplication
public class BackendApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
