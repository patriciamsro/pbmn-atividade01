package com.atividade.onetomany.controller;

import com.atividade.onetomany.entities.Produto;
import com.atividade.onetomany.repositories.ProdutoRepository;
import com.atividade.onetomany.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

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
        return service.create(produto);
    }

    @PutMapping("{id}")
    public Produto update(@RequestBody Produto produto, @PathVariable String id) {
        return service.update(produto, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Produto produto) {
        service.delete(produto);
    }
}
