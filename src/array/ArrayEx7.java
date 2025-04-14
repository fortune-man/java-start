package array;

import java.util.Scanner;

/**
 * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
 * 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 */

public class ArrayEx7 {

  private static final int SUBJECT = 3;
  private static final int STUDENTS = 0;
  public static void main(String[] args) {
    // 학생수 4. 과목수 3의 이차원 배열
    System.out.println("학생수를 입력하세요:");
    Scanner scanner = new Scanner(System.in);
    int enter = scanner.nextInt();

    int[][] array = new int[enter][SUBJECT];
    int language = 0;
    int english = 0;
    int math = 0;

    int sum = 0;
    double average = 0;
    int students = array[STUDENTS].length;
    for (int i = 1; i <=array.length; i++) {
      System.out.println(String.format("%d번 학생의 성적을 입력하세요.", i));
      language = scanner.nextInt();
      english = scanner.nextInt();
      math = scanner.nextInt();
      printScores(language, english, math);

      sum = language + english + math;
      average = sum / students;
    }
    for (int j = 1; j <= students; j++) {
      System.out.println(String.format("%d번 학생의 총점: %d, 평균 : %f", j, sum, average));
    }
  }

  private static void printScores(int language, int english, int math) {
    double average;
    int sum;
    System.out.println(String.format("국어 점수: %d", language));
    System.out.println(String.format("영어 점수: %d", english));
    System.out.println(String.format("수학 점수: %d", math));

  }

}
