public class PadelPlayer extends Sportman implements RaquetPlay {

  public PadelPlayer(String name) {
    super(name);
  }

  public void train() {
    System.out.println("Hitting some swings");
  }

  public void drive(String driveType) {
    System.out.println(driveType);
  }

  public void backhand(String backhandType) {
    System.out.println(backhandType);
  }
}
