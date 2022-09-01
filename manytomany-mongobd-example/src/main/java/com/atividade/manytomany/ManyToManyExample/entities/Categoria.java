package com.atividade.manytomany.ManyToManyExample.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "categoria")
public class Categoria {

    @Id
    private String id;
    private String nome;

    @DBRef
    @JsonBackReference
    private HashSet<Produto> produtos;

}
