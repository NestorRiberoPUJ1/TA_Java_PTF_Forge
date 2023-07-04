public class MedioTransporte {

  private String medio;
  private String categoria;

  public MedioTransporte(String medio, String categoria) {
    this.medio = medio;
    this.categoria = categoria;
  }

  public String getMedio() {
    return medio;
  }

  public void setMedio(String value) {
    medio = value;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String value) {
    categoria = value;
  }

  public void mostrarMedio() {
    System.out.println("Soy un medio " + medio + " " + categoria);
  }
}
