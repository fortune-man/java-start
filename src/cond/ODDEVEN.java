package cond;

import java.util.Scanner;

/**
 * 문제: 홀수 짝수 찾기
 * 정수 `x` 가 주어지면 `x` 가 짝수이면 "짝수"를, `x` 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
 * 삼항 연산자를 사용해야 한다.
 * 참고로 `x % 2` 를사용하면홀수,짝수를쉽게계산할수있다.
 */
public class ODDEVEN {
  private static String even = "짝수";
  private static String odd = "홀수";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    boolean printEven = true;
    boolean printOdd = true;

    boolean isEven = x % 2 == 0;

    if ( isEven == true ? printEven : printOdd) {
      if (printEven) {
        System.out.println(even);
      }
      if (!printEven) {
        System.out.println(odd);
      }
    }
  }


}
