package com.cafeteria.backend;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/platos")
@CrossOrigin(origins = "*")
public class PlatosController {

    private final PlatosRepositorio repo;

    //Inyeccion del repositorio mediante constructor
    public PlatosController(PlatosRepositorio repo) {
        this.repo = repo;
    }
    
    //Devuelve la lista completa de platos almacenados en la base de datos
    @GetMapping
    public List<Platos> getAll() {
        return repo.findAll();
    }
    
    //Guarda un nuevo plato o actualiza uno existente 
    @PostMapping
    public Platos save(@RequestBody Platos platos) {
        return repo.save(platos);
    }
}
