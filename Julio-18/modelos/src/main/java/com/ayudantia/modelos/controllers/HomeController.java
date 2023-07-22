package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.Usuario;
import com.ayudantia.modelos.services.UsuarioService;
import jakarta.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

  private final UsuarioService usuarioService;

  public HomeController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping("")
  public String home(Model model) {
    ArrayList<Usuario> users = (ArrayList<Usuario>) usuarioService.allUsuarios();
    model.addAttribute("usuarios", users);
    return "index.jsp";
  }

  @GetMapping("/users/{id}")
  public String viewUser(Model model, @PathVariable("id") Long id) {
    Usuario user = usuarioService.findUsuario(id);
    if (user == null) {
      return "notFound.jsp";
    }
    model.addAttribute("usuario", user);
    return "user.jsp";
  }
}
