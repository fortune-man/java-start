package operator;

public class Logical1 {

  public static void main(String[] args) {
    System.out.println("&&: AND 연산");
    System.out.println(isTrue());
    System.out.println(trueOrFalse());
    System.out.println(isFalse());

    System.out.println("|| : OR 연산");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || false);

    System.out.println("!연산");
    System.out.println(!true);
    System.out.println(!false);

    System.out.println("변수활용");
    boolean a = true;
    boolean b = false;
    System.out.println(a && b); // false, 둘다 true가 아님
    System.out.println(a || b); // true, 둘 중 하나가 true
    System.out.println(!a);
    System.out.println(!b);
  }

  private static boolean isFalse() {
    return false && false;
  }

  private static boolean trueOrFalse() {
    return true && false;
  }

  private static boolean isTrue() {
    return true && true;
  }

}
