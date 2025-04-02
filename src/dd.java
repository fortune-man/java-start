import java.util.Set;
import java.util.TreeSet;

// 근로일 1이상. 10억 이하
// 회의일 1이상. 1만 이하
// 회의 정보 배열 길이 2
// 회의 정보 첫번째 인덱스 1이상. 두번째 인덱스 근로일 이하. 인덱스0 <= 인덱스1
// 테스트 케이스는 통과하지만
// 확장성 있는 근로일 10만 이상. 회의일 1만 이상 10만 이하 범위에서 시간 제한 초과
class CountDays {
  public int countDays(int days, int[][] meetings) {
    // 이차원 배열 시작일.종료일 카운팅 결과를 저장하는 변수 daysForMeetings 선언
    int daysForMeetings = 0;
    Set<Integer> sum = new TreeSet<>(); // 중복 대비를 위한 set사용

    // daysForMeetings 인덱스 크기만큼 반복
    for (int i = 0; i < meetings.length; i++) {
      // meetings[i][0]인덱스부터 meetings[i][1]까지의 증감수를 반복하면 조금 더 정확한 회의 일정을 저장할 수 있다.
      store(sum, meetings[i]);
    }

    return days - sum.size();
  }

  private static void store(Set<Integer> sum, int[] meetings) {
    for(int j = meetings[0]; j <= meetings[1]; j++) {
      sum.add(j);
    }
  }
}
}