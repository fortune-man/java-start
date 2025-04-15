package method;

import java.util.Scanner;

public class MethodEx4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] database = new int[1];
    int balance = database[0];

    while (true) {
      String boarderline = "--------------------------------- \n";
      String ui = "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n";
      System.out.println(boarderline + ui + boarderline);
      System.out.println("선택: ");
      int choose = scanner.nextInt();

      if (choose == 1) {
        System.out.println("입금액을 입력하세요:");
        balance += scanner.nextInt();
        String message = String.format("%d원을 입금하였습니다. 현재 잔액: %d원", balance, balance);
        System.out.println(message);
        continue;
      }

      if (choose == 2) {
        System.out.println("출금액을 입력하세요:");
        int withDrawl = scanner.nextInt();
        balance -= withDrawl;
        if (edgeCase(balance, withDrawl)) {
          continue;
        }

        String message = String.format("%d원을 출금하였습니다. 현재 잔액: %d원", balance, balance);
        System.out.println(message);
        continue;
      }

      // 잔액 변경 갱신 안되는 문제
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

  private static boolean edgeCase(int balance, int withDrawl) {
    if (balance < 0) {
      System.out.println(String.format("%d원을 출금하려 했으나 잔액이 부족합니다.", withDrawl));
      return true;
    }
    return false;
  }

}
