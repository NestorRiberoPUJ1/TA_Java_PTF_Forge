package com.ayudantia.relaciones.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "idiomas")
public class Idiomas {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 2, max = 50)
  private String nombre;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "paises_idiomas",
    joinColumns = @JoinColumn(name = "idioma_id"),
    inverseJoinColumns = @JoinColumn(name = "pais_id")
  )
  private List<Paises> paises;

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.nombre = this.nombre.toUpperCase();
    this.created_at = new Date();
    this.updated_at = new Date();
  }

  /* NOW() ON UPDATE NOW() */
  @PreUpdate
  protected void onUpdate() {
    this.updated_at = new Date();
  }

  public Idiomas() {}

  public Idiomas(@Size(min = 2, max = 50) String nombre) {
    this.nombre = nombre;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
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

  public List<Paises> getPaises() {
    return paises;
  }

  public void setPaises(List<Paises> paises) {
    this.paises = paises;
  }
}
