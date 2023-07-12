public interface RaquetPlay {
  //Se pueden omitir los modificadores
  public static final String raquetSound = "SWING";

  //Metodo predeterminado no necesita implementación
  default void swingRaquet() {
    System.out.println(raquetSound);
  }

  //El método static no necesita implementación.
  static void preparingMatch() {
    System.out.println("Alistando Juego");
  }

  //El método abstract necesita implementación.
  void drive(String driveType);
  void backhand(String backhandType);
}
