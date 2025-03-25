import java.util.Set;
import java.util.TreeSet;

public class dd {

  public static void main(String[] args) {
    /**
     You are given a positive integer days
     representing the total number of days
     an employee is available for work (starting from day 1).
     You are also given a 2D array
     meetings of size n where,
     meetings[i] = [start_i, end_i]
     represents the starting and ending days of meeting i (inclusive).

     Return the count of days when the employee is available for work but no meetings are scheduled.
     */
    // 근로일중 회의 일정이 아닌 날들을 알려주는 프로그램.
    // 이차원 배열 회의 [시작일.종료일] 사용
    // 근로가능일 사용 (양의정수)
    // 그럼 근로 가능일 중 회의에 사용된 일을 제외한 날짜의 수는 뭐야?
    // 에 대한 결과를 돌려주면 됨.
    // 어떻게 하면 구현 가능할까?
    // 이차원 배열 시작일.종료일 카운팅 결과를 저장하는 변수 daysForMeetings 선언
    // 주어진 근로가능일 - 저장된 카운팅 결과 오차를 계산하여 조회

    class Solution {
      public int countDays(int days, int[][] meetings) {
        int daysForMeetings = 0;
        Set<Integer> sum = new TreeSet<>(); // 중복 대비를 위한 set사용
        // 이차원 배열 시작일.종료일 카운팅 결과를 저장하는 변수 daysForMeetings 선언

        // daysForMeetings 인덱스 크기만큼 반복
        for (int i = 0; i < meetings.length; i++) {
          // meetings[i][0]인덱스부터 meetings[i][1]까지의 증감수를 반복하면 조금 더 정확한 회의 일정을 저장할 수 있다.
          store(sum, meetings[i]);
        }


        // 주어진 근로가능일 - 저장된 카운팅 결과 오차를 계산하여 조회
        return days - sum.size();

      }

      private static void store(Set<Integer> sum, int[] meetings) {
        for(int j = meetings[0]; j <= meetings[1]; j++) {

          // System.out.println(j); // 5 6 7 1 2 3 9 8 10
          sum.add(j);
        }
      }


    }
  }

}
