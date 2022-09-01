package com.atividade.onetoone.OneToOneExample.service;

import com.atividade.onetoone.OneToOneExample.entities.Habilitacao;
import com.atividade.onetoone.OneToOneExample.repositories.Habilitacaorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabilitacaoService {

    @Autowired
    private Habilitacaorepository repository;

    public List<Habilitacao> findAll() {
        return repository.findAll();
    }

    public Optional<Habilitacao> findById(String id) {
        return repository.findById(id);
    }

    public Habilitacao create(Habilitacao habilitacao) {
        repository.save(habilitacao);
        return repository.findById(habilitacao.getId()).get();
    }

    public Habilitacao update(Habilitacao habilitacao, String id) {
        if(repository.existsById(id)) {
            habilitacao.setId(id);
            return repository.save((habilitacao));
        }
        return null;
    }

    public void delete(Habilitacao habilitacao) {
        repository.delete(habilitacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
