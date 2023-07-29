package com.ayudantia.relaciones.services;

import com.ayudantia.relaciones.models.Idiomas;
import com.ayudantia.relaciones.repositories.IdiomasRepository;
import java.util.List;
import java.util.Optional;

public class IdiomasService {

  private final IdiomasRepository idiomasRepository;

  public IdiomasService(IdiomasRepository idiomasRepository) {
    this.idiomasRepository = idiomasRepository;
  }

  public Idiomas crearIdioma(Idiomas b) {
    return idiomasRepository.save(b);
  }

  public List<Idiomas> obtenerIdiomas() {
    return idiomasRepository.findAll();
  }

  public Idiomas buscarIdioma(Long id) {
    Optional<Idiomas> optionalIdioma = idiomasRepository.findById(id);
    if (optionalIdioma.isPresent()) {
      return optionalIdioma.get();
    } else {
      return null;
    }
  }
}
