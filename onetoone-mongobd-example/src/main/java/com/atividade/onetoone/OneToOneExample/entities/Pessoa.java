package com.atividade.onetoone.OneToOneExample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "pessoa")
public class Pessoa {

    @Id
    private String id;
    private String nome;
    private String cpf;
}
