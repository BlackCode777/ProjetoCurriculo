package com.spring_curriculo_backend.Curriculo_Spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_curriculo_backend.Curriculo_Spring.model.UsuarioModel;

/*Jpa configurations*/
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    // Método que busca um usuário pelo username
    UsuarioModel findByUsername(String username);

    // Metodo que retorna uma lista de usuarios
    List<UsuarioModel> findAll();

    // Método que verifica se o usuário existe
    boolean existsByUsername(String username);

    // Método que busca usuario por id
    UsuarioModel findById(long id);

}
