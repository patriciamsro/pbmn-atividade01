package com.atividade.onetomany.service;

import com.atividade.onetomany.entities.Marca;
import com.atividade.onetomany.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository repository;

    public List<Marca> findAll() {
        return repository.findAll();
    }

    public Optional<Marca> findById(String id) {
        return repository.findById(id);
    }

    public Marca create(Marca marca) {
        repository.save(marca);
        return repository.findById(marca.getId()).get();
    }

    public Marca update(Marca marca, String id) {
        if (repository.existsById(id)) {
            marca.setId(id);
            return repository.save(marca);
        }
        return null;
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public void delete(Marca marca) {
        repository.delete(marca);
    }
}
