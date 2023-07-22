package com.ayudantia.modelos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios")
public class Usuario {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 5, max = 200)
  private String email;

  @Size(min = 1, max = 200)
  private String nombres;

  @Size(min = 1, max = 200)
  private String apellidos;

  @Size(min = 8, max = 200)
  private String contrasena;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  public Usuario() {}

  public Usuario(
    String email,
    String nombres,
    String apellidos,
    String contrasena
  ) {
    this.email = email;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.contrasena = contrasena;
  }

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.created_at = new Date();
    this.updated_at = new Date();
  }

  /* NOW() ON UPDATE NOW() */
  @PreUpdate
  protected void onUpdate() {
    this.updated_at = new Date();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }



  
}
