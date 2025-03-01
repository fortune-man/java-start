package cond;

/**
 * 문제: "학점 계산하기"
 * 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
 * 90점 이상: "A"
 * 80점 이상 90점 미만: "B" 70점 이상 80점 미만: "C" 60점 이상 70점 미만: "D" 60점 미만: "F"
 * 점수는변수(`int score` )로지정하고,해당변수를기반으로학점을출력하자.
 */
public class GradeScore {

  public static void main(String[] args) {
    int score = 60;

    if (score >= 90) {
      System.out.println("A");
    }
    if (80 <= score && score< 90) {
      System.out.println("B");
    }
    if (70 <= score && score< 80) {
      System.out.println("C");
    }
    if (60 <= score && score< 70) {
      System.out.println("D");
    }
    if (score< 60) {
      System.out.println("F");
    }
  }
}
