package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("문자열(exit:종료) 입력: ");
      String next = scanner.next();
      if (next.equals("exit")) {
        System.exit(0);
      }
      System.out.println(next);
    }
  }

}
