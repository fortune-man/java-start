package cond;

/**
 *문제: 더 큰 숫자 찾기
 * 여러분은두개의정수변수 `a` 와 `b` 를가지고있다. `a` 의값은 `10` 이고, `b` 의값은 `20` 이다.삼항연산자를사용하여
 * 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
 */
public class MoreBigNumber {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int bigNumber = a > b ? 10 : 20;

    if (bigNumber > 0) {
      System.out.println(bigNumber);
    }
  }

}
