package com.atividade.manytomany.ManyToManyExample.repositories;

import com.atividade.manytomany.ManyToManyExample.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
