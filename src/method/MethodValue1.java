package method;

public class MethodValue1 {

  public static void main(String[] args) {
    int num = 5;
    System.out.println("1. 변경전 " + num);
    changeNumber(num);
    System.out.println("4. 변경후 " + num);
  }
  private static void changeNumber(int num) {
    System.out.println("2. 변경전 " + num);
    num = num * 2;
    System.out.println("3. 변경후 " + num);

  }

  // 출력 순서 5. 5. 10. 5
  // 자바는 항상 변수의 값 복사해서 대입
  // 값 복사 후 전달하기 때문에 이전 메모리 영향 x
  // 이런 원칙을 통해 문제를 정확하게 풀 수 있음

}
