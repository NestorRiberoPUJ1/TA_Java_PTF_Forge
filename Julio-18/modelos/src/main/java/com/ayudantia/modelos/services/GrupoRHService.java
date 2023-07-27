package com.ayudantia.modelos.services;

import com.ayudantia.modelos.models.GrupoRH;
import com.ayudantia.modelos.repositories.GrupoRHRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class GrupoRHService {

  private final GrupoRHRepository grupoRHRepository;

  public GrupoRHService(GrupoRHRepository grupoRHRepository) {
    this.grupoRHRepository = grupoRHRepository;
  }

  //Devolviendo todos los usuarios.
  public List<GrupoRH> allRHs() {
    return grupoRHRepository.findAll();
  }

  //Creando un usuario.
  public GrupoRH createRH(GrupoRH b) {
    return grupoRHRepository.save(b);
  }

  //Obteniendo la información de un usuario
  public GrupoRH findRH(Long id) {
    Optional<GrupoRH> optionalRH = grupoRHRepository.findById(id);
    if (optionalRH.isPresent()) {
      return optionalRH.get();
    } else {
      return null;
    }
  }
}
