package com.ayudantia.relaciones.controllers;

import com.ayudantia.relaciones.models.Idiomas;
import com.ayudantia.relaciones.services.IdiomasService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("idiomas")
public class IdiomasController {

  private final IdiomasService idiomasService;

  public IdiomasController(IdiomasService idiomasService) {
    this.idiomasService = idiomasService;
  }

  @GetMapping("")
  public String verIdiomas(Model model) {
    List<Idiomas> idiomas = idiomasService.obtenerIdiomas();
    model.addAttribute("idiomas", idiomas);
    return "idiomas/listado.jsp";
  }

  @GetMapping("/new")
  public String createIdioma(@ModelAttribute("idioma") Idiomas idioma) {
    return "idiomas/formulario.jsp";
  }

  @PostMapping("")
  public String create(
    @Valid @ModelAttribute("idioma") Idiomas idioma,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "idiomas/formulario.jsp";
    } else {
      idiomasService.crearIdioma(idioma);
      return "redirect:/idiomas";
    }
  }
}
