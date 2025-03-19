package casting;

public class Casting2 {

  public static void main(String[] args) {
    double doubleValue = 1.5;
    int intValue = 0;

    // 표현 범위가 큰 -> 작은 이동 중 메모리 손실 추정
//    intValue = doubleValue; // 컴파일 오류 발생 : lossy conversion from double to int
    intValue = (int) doubleValue; // 명시적으로 형변환
    System.out.println(intValue);

  }

}
