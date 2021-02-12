package programmers.lv3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Overtime_Test {
    //야근 지수
    //우선순위 큐를 이용해서 풀었다.
    //가장 높은 값을 뽑아낸다를 이용해 우선순위 큐를 이용해야겠다라고 생각했어야 했는데 그렇게 하질 못했다..
    //검색 후 아.. 하고 깨닫고 바로 우선순위 큐를 이용해 구현하였다.
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            queue.add(work);
        }
        while (n > 0) {
            int max = queue.poll();
            if (max == 0) {
                break;
            }
            queue.add(max - 1);
            n--;
        }
        long answer = 0;
        while (!queue.isEmpty()) {
            answer += Math.pow(queue.poll(), 2);
        }
        return answer;
    }
}
