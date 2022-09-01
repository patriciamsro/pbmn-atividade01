package com.atividade.onetoone.OneToOneExample.repositories;

import com.atividade.onetoone.OneToOneExample.entities.Habilitacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Habilitacaorepository extends MongoRepository<Habilitacao, String> {
}
