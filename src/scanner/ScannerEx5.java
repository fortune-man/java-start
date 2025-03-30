package scanner;

import java.util.Scanner;

/*
문제 - 사이 숫자
사용자로부터 두 개의 정수를 입력받고,
이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
사용자에게 첫 번째 숫자를 입력받으세요.
변수의 이름은 `num1` 이어야 합니다.
사용자에게 두 번째 숫자를 입력받으세요.
변수의 이름은 `num2` 이어야 합니다.
만약첫번째숫자 `num1` 이두번째숫자 `num2` 보다크다면,두숫자를교환하세요.
참고: 교환을 위해 임시 변수 사용을 고려하세요.
`num1` 부터 `num2` 까지의 각 숫자를 출력하세요.
출력 결과에 유의하세요.
다음 예시와 같이 `2,3,4,5` 처럼 `,` 로 구분해서 출력해야 합니다.
 */
public class ScannerEx5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    System.out.println("첫번째 숫자를 입력하세요:");

    System.out.println("두번째 숫자를 입력하세요:");


    if (num1 > num2) {
      int temp = num1;
      num2 = temp;
      num1 = num2;
    }
    for (int i = num1; i <= num2; i++) {
      System.out.println(i + ",");
      if (i == num2) {
        System.out.println(i);
      }
    }
  }


}
