package com.atividade.onetomany.controller;

import com.atividade.onetomany.entities.Marca;
import com.atividade.onetomany.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaService service;

    @GetMapping
    public List<Marca> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Marca> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Marca create(@RequestBody Marca marca) {
        return service.create(marca);
    }

    @PutMapping("{id}")
    public Marca update(@RequestBody Marca marca, @PathVariable String id) {
        return service.update(marca, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Marca marca) {
        service.delete(marca);
    }

}
