package com.ayudantia.modelos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "grupos_sanguineos")
public class GrupoRH {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 2, max = 3)
  private String rh;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  @OneToMany(mappedBy = "rh", fetch = FetchType.LAZY)
  private List<Usuario> usuarios;

  public GrupoRH() {}

  public GrupoRH(String rh) {
    this.rh = rh;
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

  public String getRh() {
    return rh;
  }

  public void setRh(String rh) {
    this.rh = rh;
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

  public List<Usuario> getUsuarios() {
    return usuarios;
  }

  public void setUsuarios(List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
