package array;

public class ArrayDi4 {

  public static void main(String[] args) {
    int[][] arr = new int[2][3];

    int i = 1;

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = i++;
      }
    }
  }

}
