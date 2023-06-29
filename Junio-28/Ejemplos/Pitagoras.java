public class Pitagoras {

  public double computeHipotenuse(int cat1, int cat2) {
    float result = (float) Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
    return result;
  }
}
