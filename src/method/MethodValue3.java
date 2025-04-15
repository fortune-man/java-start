package method;

public class MethodValue3 {

  public static void main(String[] args) {
    int number = 5;
    System.out.println("changeNumber 호출 전, num1: " + number);
    number = changeNumber(number);
    System.out.println("changeNumber 호출 전, num1: \" + num");
  }

  private static int changeNumber(int number) {
    number = number * 2;
    return number;
  }

}
