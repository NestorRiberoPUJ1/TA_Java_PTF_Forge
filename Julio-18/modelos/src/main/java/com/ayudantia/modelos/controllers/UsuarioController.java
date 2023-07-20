package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.Usuario;
import com.ayudantia.modelos.services.UsuarioService;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping("")
  public ArrayList<Usuario> getAll() {
    return (ArrayList<Usuario>) usuarioService.allUsuarios();
  }

  @PostMapping("")
  public Usuario create(
    @RequestParam(value = "email") String email,
    @RequestParam(value = "nombres") String nombres,
    @RequestParam(value = "apellidos") String apellidos,
    @RequestParam(value = "contrasena") String contrasena
  ) {

    Usuario user = new Usuario(email, nombres, apellidos, contrasena);
    return usuarioService.createUsuario(user);
  }

  @GetMapping("/{id}")
  public String getById(@PathVariable("id") Long id) {
    return "getById";
  }
}
