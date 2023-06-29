public class Physics {

  public Double computeTimeFreeFall(Double height) {
    Double g = 10.0;
    /* Aplicar formula caida libre */
    Double time = Math.sqrt(height / (g * 0.5));
    return time;
  }
  
}
