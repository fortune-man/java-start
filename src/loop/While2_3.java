package loop;

import java.util.Scanner;

public class While2_3 {
// 충분한 분석 필요
  public static void main(String[] args) {
  // Java로 1~10 더하는 계산기 완성
    int n = 1;
    int sum = 0;
    while (n<=10) {
      System.out.println("덧셈 수=" + n);
      sum+=n;
      n++;
    }
    System.out.println("계산 결과=" + sum);
  }

}
