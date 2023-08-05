package com.curriculo_pring_backend.curriculo_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculo_pring_backend.curriculo_backend.model.UsuarioModel;
import com.curriculo_pring_backend.curriculo_backend.repository.UsuarioRepository;

@RestController
public class controller {

    // UsuarioRepository
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<UsuarioModel> listaUsuarios() {
        return usuarioRepository.findAll();
    }

}
