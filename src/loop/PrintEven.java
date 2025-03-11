package loop;

/*
문제: 짝수 출력
반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, `num` 이라는 변수를 사용하여 수를
표현해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
public class PrintEven {

  public static void main(String[] args) {
    iterateUseForLoop();

    iterateUseWhileLoop();
  }

  private static void iterateUseWhileLoop() {
    int j = 2;
    int whileCount = 1;
    while (j <= 20) {
      if (j % 2 == 0) {
        System.out.println(String.format("while문 사용 도출된 짝수 = %d, %d개", j, whileCount));
        j= j + 2;
        whileCount++;
      }
    }
  }

  private static void iterateUseForLoop() {
    int forCount = 1;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(String.format("for문 사용 도출된 짝수 = %d, %d개", i, forCount));
        forCount++;
      }
    }
  }

}
