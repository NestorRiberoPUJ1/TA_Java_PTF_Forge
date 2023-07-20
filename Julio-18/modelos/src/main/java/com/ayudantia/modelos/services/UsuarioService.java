package com.ayudantia.modelos.services;

import com.ayudantia.modelos.models.Usuario;
import com.ayudantia.modelos.repositories.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public UsuarioService(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
  }

  //Devolviendo todos los usuarios.
  public List<Usuario> allUsuarios() {
    return usuarioRepository.findAll();
  }

  //Creando un usuario.
  public Usuario createUsuario(Usuario b) {
    return usuarioRepository.save(b);
  }

  //Obteniendo la información de un usuario
  public Usuario findUsuario(Long id) {
    Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
    if (optionalUsuario.isPresent()) {
      return optionalUsuario.get();
    } else {
      return null;
    }
  }
}
