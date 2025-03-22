package casting;

public class Castring3 {

  public static void main(String[] args) {
    long maxIntValue = 2147483647;
    long maxIntOver = 2147483648L;
    int intValue = 0;

    intValue = (int) maxIntValue;
    System.out.println("maxIntValue casting= " + maxIntValue);

    intValue = (int) maxIntOver;
    System.out.println("maxIntOver casting= " + maxIntOver);
  }

}
