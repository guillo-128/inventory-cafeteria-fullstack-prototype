package com.cafeteria.backend;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio JPA para la entidad platos
 * Permite realizar operaciones CRUD sobre la tabla "platos" sin necesidad de escribir consultas SQL
 */
public interface PlatosRepositorio extends JpaRepository<Platos, Long> {}
