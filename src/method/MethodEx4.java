package method;

import java.util.Scanner;

public class MethodEx4 {

  public static void main(String[] args) {
    int balance = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String boarderline = "--------------------------------- \n";
      String ui = "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n";
      System.out.println(boarderline + ui + boarderline);
      System.out.println("선택: ");
      int choose = scanner.nextInt();
      if (choose == 1) {
        System.out.println("입금액을 입력하세요:");
        balance = scanner.nextInt();
        String message = String.format("%d원을 입금하였습니다. 현재 잔액: %d원", balance, balance);
        System.out.println(message);
        continue;
      }
      if (choose == 2) {
        System.out.println("출금액을 입력하세요:");
        int withDrawl = scanner.nextInt();
        int state = balance - withDrawl;
        String message = String.format("%d원을 출금하였습니다. 현재 잔액: %d원", withDrawl, state);
        System.out.println(message);
        continue;
      }
      if (choose == 3) {
        System.out.println(String.format("현재 잔액: %d원", balance));
        continue;
      }
      if (choose == 4) {
        System.out.println("시스템을 종료합니다.");
        break;
      }

    }
  }

}
