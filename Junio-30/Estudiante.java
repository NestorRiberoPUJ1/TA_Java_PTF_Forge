public class Estudiante extends Persona {

  private int curso;

  public Estudiante(
    String id,
    String nombre,
    String apellido,
    String genero,
    String fecha_nacimiento,
    int curso
  ) {
    super(id, nombre, apellido, genero, fecha_nacimiento);
    this.curso = curso;
  }

  public int getCurso() {
    return curso;
  }

  public void setCurso(int value) {
    curso = value;
  }

  public void estudiar() {
    System.out.println("Estoy estudiando en el curso " + curso);
  }

  public void saludar() {
    super.saludar();
    System.out.println("... Y estoy estudiando");
  }
}
