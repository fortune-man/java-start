package operator;

public class Compare2 {

  public static void main(String[] args) {
    String string1 = "string1";
    String string2 = "string2";

    boolean result1 = "hello".equals(string1);
    boolean result2 = string1.equals("hello1");
    boolean result3 = string1.equals(string2);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);
  }

}
