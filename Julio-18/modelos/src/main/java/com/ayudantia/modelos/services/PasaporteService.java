package com.ayudantia.modelos.services;

import com.ayudantia.modelos.models.Pasaporte;
import com.ayudantia.modelos.repositories.PasaporteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PasaporteService {

  private final PasaporteRepository pasaporteRepository;

  public PasaporteService(PasaporteRepository pasaporteRepository) {
    this.pasaporteRepository = pasaporteRepository;
  }

  //Devolviendo todos los Pasaportes.
  public List<Pasaporte> allPasaportes() {
    return pasaporteRepository.findAll();
  }

  //Creando un Pasaporte.
  public Pasaporte creaPasaporte(Pasaporte b) {
    return pasaporteRepository.save(b);
  }

  //Obteniendo la información de un Pasaporte
  public Pasaporte findPasaporte(Long id) {
    Optional<Pasaporte> optionalPasaporte = pasaporteRepository.findById(id);
    if (optionalPasaporte.isPresent()) {
      return optionalPasaporte.get();
    } else {
      return null;
    }
  }
}
