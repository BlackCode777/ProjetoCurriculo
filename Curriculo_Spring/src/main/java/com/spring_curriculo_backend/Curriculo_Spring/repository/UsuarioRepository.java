package com.spring_curriculo_backend.Curriculo_Spring.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.spring_curriculo_backend.Curriculo_Spring.model.UsuarioModel;

import java.util.List;

import org.springframework.data.domain.Page;

public interface UsuarioRepository extends ElasticsearchRepository<UsuarioModel, Long> {

    /* Buscando usuários pelo username */
    Page<UsuarioModel> findAllByUsername(String username);

    List<UsuarioModel> findByUsername(String username);

    /* Listando username por id */
    List<UsuarioModel> findById(long id);

}
