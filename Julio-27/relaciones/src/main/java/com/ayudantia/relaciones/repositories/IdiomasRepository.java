package com.ayudantia.relaciones.repositories;

import com.ayudantia.relaciones.models.Idiomas;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomasRepository extends CrudRepository<Idiomas, Long> {
  <S extends Idiomas> S save(S entity);

  List<Idiomas> findAll();

  Optional<Idiomas> findById(Long id);
}
