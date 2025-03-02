package cond;

import java.util.Scanner;

/**
 * 문제: "거리에 따른 운송 수단 선택하기"
 * 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
 * 거리가 1km 이하이면: "도보" 거리가 10km 이하이면: "자전거" 거리가 100km 이하이면: "자동차" 거리가 100km 초과이면: "비행기"
 * 거리는변수(`int distance` )로지정하고,해당변수를기반으로운송수단을출력하자.
 */
public class Deliver {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int distance = scanner.nextInt();
    if (distance <= 1) {
      System.out.println("도보");
    }
    if (1 < distance && distance <= 10) {
      System.out.println("자전거");
    }
    if (10 < distance && distance <= 100) {
      System.out.println("자동차");
    }
    if (100 < distance) {
      System.out.println("비행기");
    }
  }
}
