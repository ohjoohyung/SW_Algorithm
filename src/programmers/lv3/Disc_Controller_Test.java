package programmers.lv3;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Disc_Controller_Test {
    //디스크 컨트롤러
    //SJF 알고리즘을 구현하는 문제
    //검색 후 해결했다.
    //우선 대기 시간을 오름차순으로 정렬한다.
    //그 후 실행 시간이 오름차순으로 정렬이 된 우선순위 큐를 만들고 대기 시간이 endTime 보다 작은 배열을 큐에 넣어준다.
    //만약 큐가 비어있다는 뜻은 endTime 이후에 텀이 있다는 뜻으로 endTime 을 현재 index 의 대기 시간으로 바꿔주면 된다.
    //그게 아니면 큐에서 제일 앞에 있는 배열(실행 시간이 가장 작은)을 뽑아내고 이를 이용해 시간을 더해준다.
    //이를 count 가 jobs 길이보다 클 때까지 반복
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0;
        int endTime = 0; //수행되고난 직후의 시간
        int jobsIndex = 0;

        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));
        Queue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        while (count < jobs.length) {
            while (jobsIndex < jobs.length && jobs[jobsIndex][0] <= endTime) {
                queue.add(jobs[jobsIndex++]);
            }

            if (queue.isEmpty()) {
                endTime = jobs[jobsIndex][0];
            }else {
                int[] tmp = queue.poll();
                answer += tmp[1] + endTime - tmp[0];
                endTime += tmp[1];
                count++;
            }
        }

        return answer / jobs.length;
    }
}
