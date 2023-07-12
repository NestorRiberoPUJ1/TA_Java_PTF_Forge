public class Human {

  private String nombre;
  private Pet mascota;

  public Human(String nombre, Pet mascota) {
    this.nombre = nombre;
    this.mascota = mascota;
  }

  public Human(String nombre) {
    this.nombre = nombre;
    this.mascota = new Pet();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String value) {
    nombre = value;
  }

  public Pet getMascota() {
    return mascota;
  }

  public void setMascota(Pet value) {
    mascota = value;
  }
}
