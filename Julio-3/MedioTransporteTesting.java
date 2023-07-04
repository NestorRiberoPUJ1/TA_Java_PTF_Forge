import java.util.ArrayList;
import java.util.Arrays;

public class MedioTransporteTesting {

  public static void main(String[] args) {
    MedioTransporte avion = new MedioTransporte("Aire", "Masivo");
    MedioTransporte barco = new MedioTransporte("Agua", "Masivo");
    MedioTransporte carro = new MedioTransporte("Tierra", "Particular");
    MedioTransporte transbordador = new MedioTransporte(
      "Espacial",
      "Particular"
    );
    ArrayList<Object> vehiculos = new ArrayList<Object>(
      Arrays.asList(avion, barco, carro)
    );
    System.out.println(vehiculos);
    avion.mostrarMedio();
    arrancar(barco.getMedio());
    arrancar(carro.getMedio());

    MedioTerrestre pickup = new MedioTerrestre("Particular", 4, 5);
    pickup.mostrarMedio();
  }

  private static void arrancar(String medio) {
    switch (medio) {
      case "Aire":
        System.out.println("Despegando");
        break;
      case "Tierra":
        System.out.println("Arrancando");
        break;
      case "Agua":
        System.out.println("Zarpando");
        break;
      default:
        System.out.println("Medio desconocido");
        break;
    }
  }
}
