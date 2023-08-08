package com.curriculo_pring_backend.curriculo_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculo_pring_backend.curriculo_backend.model.UsuarioModel;
import com.curriculo_pring_backend.curriculo_backend.repository.UsuarioRepository;

@RestController
public class controller {

    // UsuarioRepository
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Atualizar usuario no banco de dados por id
    @PutMapping("/usuario")
    public UsuarioModel atualizarUsuario(UsuarioModel id) {
        return usuarioRepository.save(id);
    }

    // Salvar usuario no banco de dados
    @PostMapping("/usuario")
    public UsuarioModel salvarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/usuario")
    public List<UsuarioModel> listaUsuarios() {
        return usuarioRepository.findAll();
    }

}
