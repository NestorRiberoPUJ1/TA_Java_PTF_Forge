public class PhysicsTesting {

  public static void main(String[] args) {
    Physics calculator = new Physics();
    Double result = calculator.computeTimeFreeFall(24.0);
    System.out.println(result);
  }
}
