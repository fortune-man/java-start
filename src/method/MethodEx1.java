package method;

public class MethodEx1 {

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    calcuateABC(a, b, c);

    int x = 15;
    int y = 25;
    int z = 35;
    caculateXYZ(x,y,z);
  }

  private static void caculateXYZ(int x , int y, int z) {

    int sum = x + y + z;
    double average;
    average = sum / 3.0;
    System.out.println("평균값: " + average);
  }

  private static void calcuateABC(int a, int b, int c) {
    int sum = a + b + c;
    double average = sum / 3.0;
    System.out.println("평균값: " + average);
  }

}
