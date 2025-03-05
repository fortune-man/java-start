package loop;

public class While2_3 {
// 충분한 분석 필요
  public static void main(String[] args) {
    int i = getI();
    loopMinus(i);
  }

  private static void loopMinus(int i) {
    int j = 10;
    int minus = 55;
    while (j >= 1) {

      minus = minus - j;
      int endNum2 = 1;
      System.out.println("i:" + i + ", minus:" + minus);
      j--;
    }
  }

  // 이참에 재미를..
  // 그래서 대체 내가 지구상에서 어떤 누구보다도 자신있게 잘할 수 있는 일 한가지는 뭘까
  // 살아있는 느낌이라..
  private void loopForIterateImplementsResult(int k) {
    String pwa;
    String getMyHome;
    String basicComputerScience;
    String requiredAPIForMarketPlace;
    String productMarketFit;
    String growthAndKeepPeaceOfMindByEconomyAndJob;

    boolean done = false;
    while (!done) {
      pwa = "deliver to jusung construction and use this app then solve their problem. it can helps their time saved 40% than before";
      growthAndKeepPeaceOfMindByEconomyAndJob = "keep achieve goals and growth trust in your job";
      productMarketFit = "keep paying for us while at least 6 month that costs are more than 238만원(연봉 3400만원)";
      basicComputerScience = "must be done in 1 year and also important deep understand for later";
      requiredAPIForMarketPlace = "hear market place's void and make it better and faster";
      getMyHome = "get your home and your family and take care of them. you should be multiplier. be humble.";

    }

  }

  private static int getI() {
    int sum = 0;
    int i = 1;
    int endNum = 30;

    while (i <= endNum) {
      sum = sum + i;
      System.out.println("i:" + i + ", sum:" + sum);
      i++;
    }
    return i;
  }

}
