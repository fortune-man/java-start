package scanner;

import java.util.Scanner;

public class Scanner1 {

  public static void main(String[] args) {

    // 사용자 입력을 받기 위한 System.in 주입한 Scanner 객체 사용?
    Scanner scanner = new Scanner(System.in);
    System.out.println("문자열 입력: ");

    // 스캐너를 통해 문자열 입력
    String next = scanner.next();
    String nextLine = scanner.nextLine();

    // 차이가 뭘까?
    System.out.println("첫번째 입력: " + next);
    System.out.println("두번째 입력: " + nextLine);

    // 정수 입력. 출력
    System.out.println("정수를 입력하세요");
    int intValue = scanner.nextInt();
    System.out.println("입력한 정수 " + intValue);

    // 실수 입력. 출력
    System.out.println("실수를 입력하세요");
    double doubleValue = scanner.nextDouble();
    System.out.println("입력한 실수 " + doubleValue);


    // 정수 입력 . 출력

    // 실수 입력 . 출력
  }

}
