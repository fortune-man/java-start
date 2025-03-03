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

  // 이른 최적화
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // scanner에 정수 입력되면
    int x = scanner.nextInt(); // 변수에 대입

    String result = x % 2 == 0 ? even : odd; // 변수가 2로 나누어떨어지는 조건이 참인 경우 변수 even, 아닌 경우 odd를 return
    System.out.println(result); // return 된 문자열을 변수 result에 대입하여 출력!
  }
}
