package scanner;

import java.util.Scanner;

// 10년 진심으로 할만한거??
// 10년 찐하게 해도 괜찮은거?
public class ScannerWhileEx1 {

  // 내가 이걸 찐텐으로 즐기나?
  // 억텐인가?
  // 이걸로 현재에 몰입하고 있나 내가?
  // 재밌어하는 훈련은 가능하지.. 따지는게 무의미한가? 그날그날 다르니..?
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("이름을 입력하세요 (종료를 입력하면 종료)");
      String name = input.nextLine();
      if(name.equals("종료")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      System.out.println("나이를 입력하세요: ");
      int age = input.nextInt();
      input.nextLine(); // 숫자 입력 후의 줄바꿈 처리
      System.out.println("입력한 이름: " + name +  ",나이: " + age );
    }

  }

}
