package com.atividade.manytomany.ManyToManyExample.controller;

import com.atividade.manytomany.ManyToManyExample.entities.Categoria;
import com.atividade.manytomany.ManyToManyExample.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @GetMapping
    public List<Categoria> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Categoria> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return service.create(categoria);
    }

    @PutMapping("{id}")
    public Categoria update(@RequestBody Categoria categoria, @PathVariable String id) {
        return service.update(categoria, id);
    }

    @DeleteMapping
    public void delete(@RequestBody Categoria categoria) {
        service.delete(categoria);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
