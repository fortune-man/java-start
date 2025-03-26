package scanner;

import java.util.Scanner;

public class ScannerEx2 {

  /**
   * 사용자로부터 하나의 정수를 입력받고,
   * 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("하나의 정수를 입력하세요");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("짝수입니다.");
    }

    else if (number % 2 != 0) {
      System.out.println("홀수입니다.");
    }

    // number의 제약은 어느정도인지? - 10억 까지 ok
    // 조금 더 확장성 있는 규모에서 어떻게 처리하는지? - 100억 이상. 1조 단위 InputMismatchException
  }

}
