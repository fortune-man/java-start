package method;

public class MethodCasting2 {

  public static void main(String[] args) {
    int number = 100;
    printDouble(number);
    printFloat(number);
  }

  private static void printDouble(double number) {
    System.out.println("숫자:" + number);
  }

  private static void printFloat(float number) {
    System.out.println("숫자:" + number);
  }

}
