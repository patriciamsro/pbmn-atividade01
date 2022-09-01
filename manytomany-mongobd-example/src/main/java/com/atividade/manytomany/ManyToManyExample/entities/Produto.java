package com.atividade.manytomany.ManyToManyExample.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Document(collection = "produto")
public class Produto {

    @Id
    private String id;
    private String nome;
    private Double preco;

    @DBRef
    @JsonManagedReference
    private HashSet<Categoria> categorias;

}
