package cond;

import java.util.Scanner;

/**
 * 문제: "학점에 따른 성취도 출력하기"
 * `String grade` 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은
 * 성취도를 나타낸다.
 * "A": "탁월한 성과입니다!"
 * "B": "좋은 성과입니다!"
 * "C": "준수한 성과입니다!" "D": "향상이 필요합니다." "F": "불합격입니다."
 * 나머지: "잘못된 학점입니다."
 * `switch` 문을 사용해서 문제를 해결하자.
 */
public class GradeResult{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String grade = scanner.next();
    switch(grade){
      case "A":
        System.out.println("탁월한 성과입니다!");
        break; // break문은 현재 실행 중인 코드를 끝내고 switch문을 빠져나가게 하는 역할을 한다
      // break문이 만약 없으면 일치하는 case 이후의 모든 case 코드들이 순서대로 실행된다
      case "B":
        System.out.println("좋은 성과입니다!");
        break;
      case "C":
        System.out.println("준수한 성과입니다!");
        break;
      case "D":
        System.out.println("향상이 필요합니다.");
        break;
      case "F":
        System.out.println("불합격입니다.");
        break;
      default:
        System.out.println("잘못된 학점입니다.");
        // 조건식의 결과값이 모든 case의 값과 일치하지 않을 때 실행된다.
        // default 구문은 선택이다.
        // if, else-if, else 구조와 동일하다.
    }


  }
}
