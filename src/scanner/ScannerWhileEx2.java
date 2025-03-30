package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
  static int price;
  static int quantity;
  static int amount;

  public ScannerWhileEx2(int amount, int price, int quantity) {
    this.amount = amount;
    this.price = price;
    this.quantity = quantity;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    price = scanner.nextInt();
    quantity = scanner.nextInt();

    amount = price * quantity;

    System.out.println(String.format("상품의 가격을 입력하세요: (-1을 입력하면 종료): %d", price));
    System.out.println(String.format("구매하려는 수량을 입력하세요: %d", quantity));
    System.out.println(String.format("총 비용: %d달러", amount));
  }
}
