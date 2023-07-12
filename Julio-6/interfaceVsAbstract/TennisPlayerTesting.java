public class TennisPlayerTesting {

  public static void main(String[] args) {

    TennisPlayer andy= new TennisPlayer("Andy");

    andy.swingRaquet();
    TennisPlayer.preparingMatch();
    andy.drive("DropShot");
  }
}
