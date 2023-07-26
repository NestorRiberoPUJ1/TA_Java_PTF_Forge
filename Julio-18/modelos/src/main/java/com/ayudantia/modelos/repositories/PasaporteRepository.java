package com.ayudantia.modelos.repositories;

import com.ayudantia.modelos.models.Pasaporte;
import com.ayudantia.modelos.models.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface PasaporteRepository extends CrudRepository<Pasaporte, Long> {
  /*Guardar
   * INSERT...
   */
  <S extends Usuario> S save(S entity);

  /*Encuentra todos
   * SELECT * FROM PASAPORTES
   */
  List<Pasaporte> findAll();

  /*Encuentra por id
   * SELECT * FROM PASAPORTES
   * WHERE id = "id"
   */
  Optional<Pasaporte> findById(Long id);
}
