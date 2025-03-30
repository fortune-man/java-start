package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
  static int price;
  static int quantity;
  static int amount;
  static final int EXIT = -1;


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    // 메모리 저장 문제
    while(!exit) {
      System.out.println(String.format("상품의 가격을 입력하세요: (-1을 입력하면 종료): %d", price));
      price = scanner.nextInt();
      System.out.println(String.format("구매하려는 수량을 입력하세요: %d", quantity));
      quantity = scanner.nextInt();

      if(price == -1 || quantity == -1) {
        System.out.println("프로그램을 종료합니다.");
        exit = true;
      }
      amount = price * quantity;
      System.out.println(String.format("총 비용: %d원", amount));
      scanner.close(); // IllegalStateException

    }

  }
}
