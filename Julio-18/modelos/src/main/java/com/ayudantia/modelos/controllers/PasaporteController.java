package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.Pasaporte;
import com.ayudantia.modelos.models.Usuario;
import com.ayudantia.modelos.services.PasaporteService;
import com.ayudantia.modelos.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pasaporte")
public class PasaporteController {

  private final UsuarioService usuarioService;
  private final PasaporteService pasaporteService;

  public PasaporteController(
    UsuarioService usuarioService,
    PasaporteService pasaporteService
  ) {
    this.usuarioService = usuarioService;
    this.pasaporteService = pasaporteService;
  }

  @PostMapping("")
  public String create(
    @RequestParam("serial") String serial,
    @RequestParam("usuario") Long user
  ) {
    Usuario usuario = usuarioService.findUsuario(user);
    Pasaporte pass = new Pasaporte(serial, usuario);

    System.out.println(usuario);
    System.out.println(pass);

    pasaporteService.creaPasaporte(pass);

    return "redirect:/users/" + user;
  }
}
