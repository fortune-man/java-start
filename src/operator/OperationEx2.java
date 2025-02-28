package operator;

public class OperationEx2 {
  // 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요
  static double val1 = 1.5;
  static double val2 = 2.5;
  static double val3 = 3.5;

  public static void main(String[] args) {
    double sum = val1 + val2 + val3;
    System.out.println("합= " + sum);

    double average = sum / 3;
    System.out.println("평균= " + average);
  }

}
