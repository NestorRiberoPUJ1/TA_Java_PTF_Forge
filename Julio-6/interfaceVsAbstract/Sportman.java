public abstract class Sportman {

  private String name;

  public Sportman(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String value) {
    name = value;
  }

  public void exercise() {
    System.out.println("Exercising");
  }

  public abstract void train();
}
