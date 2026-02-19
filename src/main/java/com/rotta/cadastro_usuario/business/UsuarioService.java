package com.rotta.cadastro_usuario.business;

import com.rotta.cadastro_usuario.infrastructure.entitys.Usuario;
import com.rotta.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void SalvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }
    
}
