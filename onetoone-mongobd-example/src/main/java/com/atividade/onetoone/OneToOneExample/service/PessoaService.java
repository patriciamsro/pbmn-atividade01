package com.atividade.onetoone.OneToOneExample.service;

import com.atividade.onetoone.OneToOneExample.entities.Pessoa;
import com.atividade.onetoone.OneToOneExample.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Optional<Pessoa> findById(String id) {
        return repository.findById(id);
    }

    public Pessoa create(Pessoa pessoa) {
        repository.save(pessoa);
        return repository.findById(pessoa.getId()).get();
    }

    public Pessoa update(Pessoa pessoa, String id) {
        if(repository.existsById(id)) {
            pessoa.setId(id);
            return repository.save(pessoa);
        }
        return null;
    }

    public void delete(Pessoa pessoa) {
        repository.delete(pessoa);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
