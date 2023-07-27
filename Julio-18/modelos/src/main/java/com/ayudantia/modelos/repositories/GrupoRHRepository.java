package com.ayudantia.modelos.repositories;

import com.ayudantia.modelos.models.GrupoRH;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRHRepository extends CrudRepository<GrupoRH, Long> {
  /*Guardar
   * INSERT...
   */
  <S extends GrupoRH> S save(S entity);

  /*Encuentra todos
   * SELECT * FROM GrupoRH
   */
  List<GrupoRH> findAll();

  List<GrupoRH> findByRh(String rh);

  /*Encuentra por id
   * SELECT * FROM GrupoRH
   * WHERE id = "id"
   */
  Optional<GrupoRH> findById(Long id);
}
