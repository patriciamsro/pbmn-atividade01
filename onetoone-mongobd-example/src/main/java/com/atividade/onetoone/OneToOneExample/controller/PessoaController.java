package com.atividade.onetoone.OneToOneExample.controller;

import com.atividade.onetoone.OneToOneExample.entities.Pessoa;
import com.atividade.onetoone.OneToOneExample.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping
    public List<Pessoa> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Pessoa> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return service.create(pessoa);
    }

    @PutMapping("{id}")
    public Pessoa update(@RequestBody Pessoa pessoa, @PathVariable String id) {
        return service.update(pessoa, id);
    }

    @DeleteMapping
    public void delete(@RequestBody Pessoa pessoa) {
        service.delete(pessoa);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
