package array;

import java.util.Scanner;

/**
 * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
 * 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 */

public class ArrayEx7 {

  public static void main(String[] args) {
    // 학생수 4. 과목수 3의 이차원 배열
    Scanner scanner = new Scanner(System.in);
    int enter = scanner.nextInt();

    int[][] array = new int[4][3];
    int language = scanner.nextInt();
    int english = scanner.nextInt();
    int math = scanner.nextInt();
    scanner.close();

    int sum = 0;
    double average = 0;
    for (int i = 0; i < array.length; i++) {
      int students = array[i].length;
      System.out.println(String.format("%d번 학생의 성적을 입력하세요.", students));
      for (int j = 0; j < array.length; j++) {
        System.out.println(String.format("국어 점수: %d", language));
        System.out.println(String.format("영어 점수: %d", english));
        System.out.println(String.format("수학 점수: %d", math));
        sum = language + english + math;
        average = sum / students;
        System.out.println(String.format("%d번 학생의 총점: %d, 평균 : %f", students, sum, average));
      }
    }


//
//    // 총점과 평균 출력
//    for (int i = 0; i < array.length; i++) {
//
//      System.out.println(String.format("%d번 학생의 총점: %d, 평균 : %d", sum, average));
//    }

  }

}
