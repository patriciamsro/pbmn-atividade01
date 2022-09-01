package com.atividade.manytomany.ManyToManyExample.service;

import com.atividade.manytomany.ManyToManyExample.entities.Produto;
import com.atividade.manytomany.ManyToManyExample.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Optional<Produto> findById(String id) {
        return repository.findById(id);
    }

    public Produto create(Produto produto) {
        repository.save(produto);
        return repository.findById(produto.getId()).get();
    }

    public Produto update(Produto produto, String id) {
        if(repository.existsById(id)) {
            produto.setId(id);
            return repository.save(produto);
        }
        return null;
    }

    public void delete(Produto produto) {
        repository.delete(produto);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
