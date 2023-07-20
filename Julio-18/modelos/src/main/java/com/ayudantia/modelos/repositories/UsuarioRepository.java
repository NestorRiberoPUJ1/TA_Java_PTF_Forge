package com.ayudantia.modelos.repositories;

import com.ayudantia.modelos.models.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
  /*Guardar
   * INSERT...
   */
  <S extends Usuario> S save(S entity);

  /*Encuentra todos
   * SELECT * FROM USUARIOS
   */
  List<Usuario> findAll();

  /*Encuentra por nombres
   * SELECT * FROM USUARIOS
   * WHERE nombres ="nombres"
   */
  List<Usuario> findByNombres(String nombres);

  /*Encuentra por apellidos
   * SELECT * FROM USUARIOS
   * WHERE apellidos ="apellidos"
   */
  List<Usuario> findByApellidos(String apellidos);

  /*Encuentra por id
   * SELECT * FROM USUARIOS
   * WHERE id = "id"
   */
  Optional<Usuario> findById(Long id);
}
