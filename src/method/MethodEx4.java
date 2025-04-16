package method;

import java.util.Scanner;

public class MethodEx4 {

  public static void main(String[] args) {
    int[] table = new int[1];
    int balance = table[0];
    int withdraw = 0;
    int deposit = 0;

    String message = "";
    Scanner scanner = new Scanner(System.in);
    int choose = getChoose(scanner);

    switch(choose) {
      case 1:
        System.out.println("입금액을 입력하세요: \n");

        deposit = scanner.nextInt();
        message = String.format("%d원을 입금하였습니다. 현재 잔액: %d원", deposit, setDeposit(balance, choose));

        System.out.println(message);
        
      case 2:
        setWidthDraw(balance, withdraw, message);
        message = String.format("%d원을 출금하였습니다. 현재 잔액: %d원", withdraw, balance);
        System.out.println(message);
      case 3:
        message = String.format("현재 잔액: %d원", balance);
        System.out.println(message);
      case 4:
        message = "시스템을 종료합니다.";
        System.out.println(message);
      case 5:
        message = String.format("%d원을 출금하려 했으나 잔액이 부족합니다.", balance);
        System.out.println(message);
    }

  }

  // 현재 잔액보다 출금액이 크면 오류
  private static void setWidthDraw(int balance, int widthDraw, String message) {
    if( widthDraw < balance ) {
      message = String.format("%d원을 출금하였습니다.현재 잔액: %d원", widthDraw, balance);
      System.out.println(message);
    }
    message = String.format("%d원을 출금하려 했으나 잔액이 부족합니다.", widthDraw);
    System.out.println(message);

  }

  // 입금하면 상태변경
  private static int setDeposit(int balance, int choose) {
    balance += choose;
    return balance;
  }

  private static int getChoose(Scanner scanner) {
    String line = "---------------------------------\n";
    String ui = "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n";

    System.out.println(line + ui + line + "선택:");

    int choose = scanner.nextInt();
    return choose;

  }
}
