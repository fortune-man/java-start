package cond;

import java.util.Scanner;

public class If3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    printStatusUser(age);



  }

  private static void printStatusUser(int age) {
    boolean kids = 7 >= age;
    boolean elementary = age >= 8 && age <= 13;
    boolean middle = 14 <= age && age <= 16;
    boolean high = 17 <= age && age <= 19;
    boolean adult = age >= 20;

    if (kids) {
      System.out.println("미취학");
    }
    else if (elementary) {
      System.out.println("초등학생");
    }


    if (middle) {
      System.out.println("중학생");
    }
    else if (high) {
      System.out.println("고등학생");
    }
    else if (adult) {
      System.out.println("성인");
    }
  }

}
