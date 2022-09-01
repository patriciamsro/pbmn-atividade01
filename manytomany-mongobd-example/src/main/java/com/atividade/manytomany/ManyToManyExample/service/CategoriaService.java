package com.atividade.manytomany.ManyToManyExample.service;

import com.atividade.manytomany.ManyToManyExample.entities.Categoria;
import com.atividade.manytomany.ManyToManyExample.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Optional<Categoria> findById(String id) {
        return repository.findById(id);
    }

    public Categoria create(Categoria categoria) {
        repository.save(categoria);
        return repository.findById(categoria.getId()).get();
    }

    public Categoria update(Categoria categoria, String id) {
        if(repository.existsById(id)) {
            categoria.setId(id);
            repository.save(categoria);
        }
        return null;
    }

    public void delete(Categoria categoria) {
        repository.delete(categoria);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
