package com.curriculo_pring_backend.curriculo_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curriculo_pring_backend.curriculo_backend.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    // Atualizando usuario no banco de dados por id
    UsuarioModel save(long id);

    // Salvar usuario no banco de dados
    UsuarioModel save(UsuarioModel usuario);

    // Pesquisa todos os usuarios
    List<UsuarioModel> findAll();

}
