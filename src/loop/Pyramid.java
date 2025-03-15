package loop;

import java.util.Scanner;

/**
 * `int rows` 를 선언해라.
 * 이 수만큼 다음과 같은 피라미드를 출력하면 된다.
 *
 * 참고: `println()` 은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 `print()` 를 사용하면 된다.
 * 예) `System.out.print("*")`
 */
public class Pyramid {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    int rows = scanner.nextInt();
    // 1부터 입력수까지 i증감 반복
    iterateNumbers(rows);
  }

  private static void iterateNumbers(int rows) {
    for(int i = 1; i <= rows; i++) {
      printStars(i);
    }
  }

  private static void printStars(int i) {
    // 1부터 i이하까지 증감하는 변수 j만큼 "*" 출력을 반복
    for(int j = 1; j <= i; j++) {
      System.out.print("*");
    }
    // 왜 줄바꿈은 "\n"이 안되는지?
    System.out.println();
  }

}
