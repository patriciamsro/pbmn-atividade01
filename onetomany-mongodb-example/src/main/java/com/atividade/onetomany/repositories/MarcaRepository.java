package com.atividade.onetomany.repositories;

import com.atividade.onetomany.entities.Marca;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends MongoRepository<Marca, String> {
}
