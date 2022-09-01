package com.atividade.manytomany.ManyToManyExample.controller;

import com.atividade.manytomany.ManyToManyExample.entities.Produto;
import com.atividade.manytomany.ManyToManyExample.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping
    public List<Produto> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Produto> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return service.create((produto));
    }

    @PutMapping("{id}")
    public Produto update(@RequestBody Produto produto, @PathVariable String id) {
        return service.update(produto, id);
    }

    @DeleteMapping
    public void delete(@RequestBody Produto produto) {
        service.delete(produto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
