package com.atividade.onetomany.service;

import com.atividade.onetomany.entities.Produto;
import com.atividade.onetomany.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

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

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public void delete(Produto produto) {
        repository.delete(produto);
    }

}
