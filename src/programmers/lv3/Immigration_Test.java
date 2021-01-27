package programmers.lv3;

import java.util.Arrays;

public class Immigration_Test {
    //입국심사
    //이분탐색을 이용한 문제
    //이분탐색을 공부해봤다고 풀 수 있겠지 하다 큰 코 다쳤다.
    //검색 후 해결했는데 다른 부분보다 mid / time 이 부분이 이해가 안갔다.
    //조금 더 찾아본 결과 속도 개념을 대입하여 이해하였다.
    //mid가 28분이면 7분에 1명 처리하는 심사관은 4명을 처리할 수 있고 10분에 1명 처리하는 심사관은 2명을 처리할 수 있다.
    //그렇다면 총 6명을 처리할 수 있고 이를 n과 비교하여 n보다 작다면 시간 부족, n보다 크거나 같다면 목표만큼 했다는 말이니 그 중 최솟값을 구하면 답을 풀 수 있다.
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = 0;
        long end = (long)times[times.length - 1] * n;
        long mid = 0;
        long answer = Long.MAX_VALUE;

        while (start <= end) {
            mid = (start + end) / 2;
            long immigration = 0;

            for (int time : times) {
                immigration += mid / time;
            }

            // 목표보다 심사 덜 함 : 시간 부족
            if (immigration < n) {
                start = mid + 1;
            } else {
                // 목표보다 더 많이하거나 목표만큼 함 : 시간 남음
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }
}
