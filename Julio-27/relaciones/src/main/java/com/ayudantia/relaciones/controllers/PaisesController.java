package com.ayudantia.relaciones.controllers;

import com.ayudantia.relaciones.models.Idiomas;
import com.ayudantia.relaciones.models.Paises;
import com.ayudantia.relaciones.services.IdiomasService;
import com.ayudantia.relaciones.services.PaisesService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("paises")
@AllArgsConstructor
public class PaisesController {

  private final PaisesService paisesService;
  private final IdiomasService idiomasService;

  @GetMapping("")
  public String verPaises(Model model) {
    List<Paises> paises = paisesService.obtenerPaises();
    model.addAttribute("paises", paises);
    return "paises/listado.jsp";
  }

  @GetMapping("/new")
  public String createPais(@ModelAttribute("pais") Paises pais) {
    return "paises/formulario.jsp";
  }

  @PostMapping("")
  public String create(
    @Valid @ModelAttribute("pais") Paises pais,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "paises/formulario.jsp";
    } else {
      paisesService.crearPais(pais);
      return "redirect:/paises";
    }
  }

  @GetMapping("/{id}")
  public String detallarPais(
    Model model,
    @PathVariable("id") Long id,
    @Valid @ModelAttribute("pais_model") Paises pais_model,
    BindingResult result
  ) {
    Paises pais = paisesService.buscarPais(id);
    if (pais == null) {
      return "paises/notFound.jsp";
    }

    List<Idiomas> idiomas = idiomasService.obtenerIdiomas();

    model.addAttribute("idiomas", idiomas);
    model.addAttribute("pais", pais);

    return "paises/detallar.jsp";
  }

  @PostMapping("/edit/{id}")
  public String edit(
    @PathVariable("id") Long id,
    @Valid @ModelAttribute("pais_model") Paises pais_model,
    BindingResult result
  ) {
    
    Paises paisOriginal = paisesService.buscarPais(id); //obtenemos el pais original por id
    List <Idiomas> idiomas= paisOriginal.getIdiomas();  //obtenemos la listade idiomas del pais original
    idiomas.add(pais_model.getIdiomas().get(0));        //agregamos el nuevo el nuevo idioma a la lista
    paisOriginal.setIdiomas(idiomas);                   //seteamos la lista de idiomas del pais original con la lista actualizada

    paisesService.crearPais(paisOriginal);
    return "redirect:/paises/"+id;
  }
}
