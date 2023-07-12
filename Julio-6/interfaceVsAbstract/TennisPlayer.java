public class TennisPlayer implements RaquetPlay {

  private String name;

  public TennisPlayer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String value) {
    name = value;
  }

  public static void preparingMatch() {
    RaquetPlay.preparingMatch();
    System.out.println("For Tennis");
  }

  public void drive(String driveType) {
    System.out.println(driveType);
  }

  public void backhand(String backhandType) {
    System.out.println(backhandType);
  }
}
