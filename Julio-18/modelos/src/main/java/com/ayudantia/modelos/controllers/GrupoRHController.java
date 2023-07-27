package com.ayudantia.modelos.controllers;

import com.ayudantia.modelos.models.GrupoRH;
import com.ayudantia.modelos.models.Usuario;
import com.ayudantia.modelos.services.GrupoRHService;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rhs")
public class GrupoRHController {

  private final GrupoRHService grupoRHService;

  public GrupoRHController(GrupoRHService grupoRHService) {
    this.grupoRHService = grupoRHService;
  }

  @GetMapping("")
  public ArrayList<GrupoRH> getAll() {
    return (ArrayList<GrupoRH>) grupoRHService.allRHs();
  }

  @PostMapping("")
  public GrupoRH create(@RequestParam(value = "rh") String rh) {
    GrupoRH newRH = new GrupoRH(rh);
    return grupoRHService.createRH(newRH);
  }

  @GetMapping("/{id}")
  public String getById(@PathVariable("id") Long id) {
    return "getById";
  }
}
