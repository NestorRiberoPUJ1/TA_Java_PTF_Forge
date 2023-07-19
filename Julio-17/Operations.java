public class Operations {

  private int result;
  private String operator;
  private int number;

  public Operations(int result, String operator, int number) {
    this.result = result;
    this.operator = operator;
    this.number = number;
  }

  public void compute(String operation) {
    if (operation != null) operator = operation;
  }
}
