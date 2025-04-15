package method;

public class MethodEx2 {
  public static void main(String[] args) {
    String message = "Hello, world!";
    iterateMessage(3, message);
    iterateMessage(5, message);
    iterateMessage(7, message);


  }
  private static void iterateMessage(int number, String message) {
    for (int i = 0; i < number; i++) {
      System.out.println(message);
    }
  }
}
