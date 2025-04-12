package array;

public class EnhancedFor1 {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      System.out.println(number);
    }

    for(int i = 1; i < numbers.length; i++){
      System.out.println("number" + i + "번의 결과는" + numbers[i]);
    }

    System.out.println("===================== \n");
    for (int number : numbers) {
      System.out.println("number" + number + "번의 결과는" + number);

    }
  }

}
