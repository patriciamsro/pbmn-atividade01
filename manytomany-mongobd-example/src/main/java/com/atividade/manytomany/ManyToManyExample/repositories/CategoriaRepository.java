package com.atividade.manytomany.ManyToManyExample.repositories;

import com.atividade.manytomany.ManyToManyExample.entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
