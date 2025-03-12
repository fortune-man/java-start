package loop;

import java.util.Scanner;

/*
반복문을 사용하여 1부터 `max` 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요. 이때, `sum` 이라는 변수를 사
용하여 누적 합을 표현하고, `i` 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다. while문, for문 2가지 버전의 정답을 만들어야 합니다.

 */
public class SumIterate {

  public static void main(String[] args) {
    // 사용자가 max를 입력하면
    Scanner scanner = new Scanner(System.in);
    int max = scanner.nextInt();
    // 1부터 입력수 까지 누적합 출력

    System.out.println("while문으로 합산 = " + sumUseWhileLoop(max));
    System.out.println("for문으로 합산= " + sumUseForLoop(max));
  }

  private static int sumUseWhileLoop(int max) {
    int i = 1;
    int sum = 0;
    while (i <= max) {
      sum += i;
      i++;
    }
    return sum;
  }

  private static int sumUseForLoop(int max) {
    int sum = 0;
    for (int i = 1; i <= max; i++) {
      sum += i;
    }
    return sum;
  }
}
