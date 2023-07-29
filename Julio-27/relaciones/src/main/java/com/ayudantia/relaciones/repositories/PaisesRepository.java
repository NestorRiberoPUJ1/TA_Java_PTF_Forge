package com.ayudantia.relaciones.repositories;

import com.ayudantia.relaciones.models.Paises;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisesRepository extends CrudRepository<Paises, Long> {
  <S extends Paises> S save(S entity);

  List<Paises> findAll();

  Optional<Paises> findById(Long id);
}
