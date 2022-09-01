package com.atividade.onetomany.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.HashSet;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "marca")
public class Marca {

    @Id
    private String id;
    private String nome;
    private String cnpj;
    private String endereco;

    @DBRef
    private HashSet<Produto> produtos;

}
