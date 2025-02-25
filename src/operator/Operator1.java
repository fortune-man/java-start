package operator;

public class Operator1 {

  public static void main(String[] args) {
    // 변수 초기화
    int a = 5;
    int b = 2;

    int sum = a + b;
    System.out.println("a + b = " + sum);
    // 값 읽기 -> 계산 -> 계산 결과를 sum에 대입 -> 최종 결과 출력 순서로 실행

    int diff = a - b;
    System.out.println("a - b = " + diff);

    int multi = a * b;
    System.out.println("a * b = " + multi);

    int div = a / b;
    System.out.println("a / b = " + div);

    int mod = a % b;
    System.out.println("a % b = " + mod);
  }

}
