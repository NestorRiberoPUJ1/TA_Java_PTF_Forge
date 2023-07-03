public class Persona {

  private String id;
  private String nombre;
  private String apellido;
  private String genero;
  private String fecha_nacimiento;

 public Persona(
    String id,
    String nombre,
    String apellido,
    String genero,
    String fecha_nacimiento
  ) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.genero = genero;
    this.fecha_nacimiento = fecha_nacimiento;
  } 

  public String getId() {
    return id;
  }

  public void setId(String value) {
    id = value;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String value) {
    nombre = value;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String value) {
    apellido = value;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String value) {
    genero = value;
  }

  public String getFecha_nacimiento() {
    return fecha_nacimiento;
  }

  public void setFecha_nacimiento(String value) {
    fecha_nacimiento = value;
  }

  public void saludar() {
    System.out.println("Hola soy " + this.nombre);
  }
}
