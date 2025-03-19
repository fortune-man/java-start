package loop;

import java.util.Scanner;

public class While2_3 {
// 충분한 분석 필요
  public static void main(String[] args) {
  // 입력 받아서 더하기 빼기 구현
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int i = 1;
    int endNum = 3;

    while (i <= endNum) {
      sum = sum + i;
      System.out.println("i=" + i + " sum=" + sum);
      i++;
    }

    }
}
