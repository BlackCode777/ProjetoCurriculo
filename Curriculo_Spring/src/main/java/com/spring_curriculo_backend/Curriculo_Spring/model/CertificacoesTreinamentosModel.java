package com.spring_curriculo_backend.Curriculo_Spring.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Anotações Lombok
@ToString
@NoArgsConstructor
@AllArgsConstructor
// Anotação que define a classe como uma entidade
@Data
// Anotação que define a classe como uma entidade
@Builder
// Anotação que define a classe como uma entidade
@EqualsAndHashCode
// Anotação que define a classe como uma entidade banco postgresql
@Entity
public class CertificacoesTreinamentosModel {

    /* Atributo id */
    private int id;
    // Atributo que recebe uma lista de certificações e treinamentos
    private String treinCursoCerificacao;
    private String instituicao;
    private String cargaHoraria;
}
