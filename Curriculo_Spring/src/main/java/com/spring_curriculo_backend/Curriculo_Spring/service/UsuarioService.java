package com.spring_curriculo_backend.Curriculo_Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_curriculo_backend.Curriculo_Spring.model.UsuarioModel;
import com.spring_curriculo_backend.Curriculo_Spring.repository.UsuarioRepository;

@Service
public class UsuarioService {

    public static UsuarioRepository usuarioRepository;

    /* Buscando usuários pelo username */
    public static List<UsuarioModel> findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

}
