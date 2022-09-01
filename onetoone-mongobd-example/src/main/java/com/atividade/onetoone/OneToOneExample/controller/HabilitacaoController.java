package com.atividade.onetoone.OneToOneExample.controller;

import com.atividade.onetoone.OneToOneExample.entities.Habilitacao;
import com.atividade.onetoone.OneToOneExample.service.HabilitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/habilitacoes")
public class HabilitacaoController {

    @Autowired
    HabilitacaoService service;

    @GetMapping
    public List<Habilitacao> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Habilitacao> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Habilitacao create(@RequestBody Habilitacao habilitacao) {
        return service.create(habilitacao);
    }

    @PutMapping("id")
    public Habilitacao update(@RequestBody Habilitacao habilitacao, @PathVariable String id) {
        return service.update(habilitacao, id);
    }

    @DeleteMapping
    public void delete(@RequestBody Habilitacao habilitacao) {
        service.delete(habilitacao);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
