public class MedioTerrestre extends MedioTransporte {

  private int numero_ruedas;
  private int pasajeros;

  public MedioTerrestre(String categoria, int numero_ruedas, int pasajeros) {
    super("Tierra", categoria);
    this.numero_ruedas = numero_ruedas;
    this.pasajeros = pasajeros;
  }

  public int getNumero_ruedas() {
    return numero_ruedas;
  }

  public void setNumero_ruedas(int value) {
    numero_ruedas = value;
  }

  public int getPasajeros() {
    return pasajeros;
  }

  public void setPasajeros(int value) {
    pasajeros = value;
  }
}
