package com.cafeteria.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidad JPA que representa un plato dentro de la base de datos.
 * Cada instancia de esta clase corresponde a una fila en la tabla "platos".
 */
@Entity
public class Platos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer n_platos;
    private Double precio;

    public Platos() {
    	
    }
    
    public Platos(String nombre, Integer n_platos, Double precio) {
        this.nombre = nombre;
        this.n_platos = n_platos;
        this.precio = precio;
    }


    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }

    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre; 
    }

    public Integer getN_platos() { 
    	return n_platos; 
    }
    
    public void setN_platos(Integer n_platos) { 
    	this.n_platos = n_platos;
    }

    public Double getPrecio() {
    	return precio; 
    }
    
    public void setPrecio(Double precio) {
    	this.precio = precio;
    }
}
