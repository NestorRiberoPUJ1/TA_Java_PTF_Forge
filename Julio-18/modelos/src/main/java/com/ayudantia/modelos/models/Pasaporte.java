package com.ayudantia.modelos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pasaportes")
public class Pasaporte {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 8, max = 12)
  private String serial;

  @Min(0)
  private int salidas;

  @Min(0)
  private int ingresos;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date emision;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "usuario_id")
  private Usuario usuario;

  public Pasaporte() {}

  public Pasaporte(String serial, Usuario usuario) {
    this.serial = serial;
    this.salidas = 0;
    this.ingresos = 0;
    this.usuario = usuario;
  }

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.emision = new Date();
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

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public int getSalidas() {
    return salidas;
  }

  public void setSalidas(int salidas) {
    this.salidas = salidas;
  }

  public int getIngresos() {
    return ingresos;
  }

  public void setIngresos(int ingresos) {
    this.ingresos = ingresos;
  }

  public Date getEmision() {
    return emision;
  }

  public void setEmision(Date emision) {
    this.emision = emision;
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

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
