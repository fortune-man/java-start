package loop;

import java.util.Scanner;

// 중첩 for문을 사용해서 구구단을 완성해라.
/*
1*1=1 1*2=2 ...
9 * 9 = 81
 */
public class NestedEx1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    printMultipleTable(number);
  }

  private static void printMultipleTable(int number) {
    for (int i = 1; i <= 9; i++) {
      int result = number * i;
      System.out.println(String.format("%d * %d = %d", number, i, result)) ;
    }
  }
}
