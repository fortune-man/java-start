package casting;

// 자동 형변환
public class Casting1 {

  // 작은 범위 -> 큰 범위 o. int, long, double
  // 큰 범위 -> 작은 범위 x. 소수점 버림, 오버플로
  public static void main(String[] args) {
    int intValue = 10;
    long longValue;
    double doubleValue;

    longValue = intValue; // int ->   long
    System.out.println("long value is " + longValue);

    doubleValue = intValue; // int -> double
    System.out.println("double value is " + doubleValue);

    doubleValue = 20L; // long -> double
    System.out.println("두번째 double value is " + doubleValue);
  }
}
