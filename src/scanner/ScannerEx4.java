package scanner;

import java.util.Scanner;

public class ScannerEx4 {

  /**
   * 사용자로부터 하나의 정수 `n` 을 입력받고,
   * 입력받은 정수 `n` 의 구구단을 출력하는 프로그램을 작성하세요.
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for(int i = 1; i <= 9; i++) {
      System.out.println(String.format("%dx%d=%d ", n,i,n*i));
    }
  }

}
