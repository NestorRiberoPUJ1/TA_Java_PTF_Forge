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
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "paises")
@Getter
@Setter
public class Paises {

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

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.nombre=this.nombre.toUpperCase();
    this.created_at = new Date();
    this.updated_at = new Date();
  }

  /* NOW() ON UPDATE NOW() */
  @PreUpdate
  protected void onUpdate() {
    this.updated_at = new Date();
  }

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "paises_idiomas",
    joinColumns = @JoinColumn(name = "pais_id"),
    inverseJoinColumns = @JoinColumn(name = "idioma_id")
  )
  private List<Idiomas> idiomas;

  public Paises() {}

  public Paises(String nombre) {
    this.nombre = nombre;
  }  

}
