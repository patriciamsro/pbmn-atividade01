package com.atividade.onetoone.OneToOneExample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "habilitacao")
public class Habilitacao {

    @Id
    private String id;
    private String numeroHabilitacao;
    private String tipoHabilitacao;
    private Date validadeHabilitacao;

    @DBRef
    private Pessoa pessoa;
}
