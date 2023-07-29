package com.ayudantia.relaciones.services;

import com.ayudantia.relaciones.models.Paises;
import com.ayudantia.relaciones.repositories.PaisesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PaisesService {

  private final PaisesRepository paisesRepository;

  public PaisesService(PaisesRepository paisesRepository) {
    this.paisesRepository = paisesRepository;
  }

  public Paises crearPais(Paises b) {
    return paisesRepository.save(b);
  }

  public List<Paises> obtenerPaises() {
    return paisesRepository.findAll();
  }

  public Paises buscarPais(Long id) {
    Optional<Paises> optionalPais = paisesRepository.findById(id);
    if (optionalPais.isPresent()) {
      return optionalPais.get();
    } else {
      return null;
    }
  }
}
