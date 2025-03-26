package scanner;

import java.util.Scanner;

public class ScannerEx3 {

  /**
   * 사용자로부터 음식의 이름( `foodName` ), 가격( `foodPrice` ), 그리고 수량( `foodQuantity` )을 입력받
   * 아, 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
   * 음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격( `foodPrice` )과 수량( `foodQuantity` )을 곱한
   * 값이며, 이를 `totalPrice` 라는 이름의 변수에 저장하세요.
   * 주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가
   * 격]원입니다." 이어야 합니다.
   * @param args
   */
  private static String foodName;
  private static int foodPrice;
  private static int foodQuantity;
  private static int totalPrice;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    foodName = input.nextLine();
    foodPrice = input.nextInt();
    foodQuantity = input.nextInt();
    totalPrice = foodPrice * foodQuantity;

    System.out.println(String.format("%s %d개를 주문하셨습니다. 총 가격은 %d원입니다.", foodName, foodQuantity, totalPrice));

  }

}
