package programmers.lv2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Spicier_Test {
    //더 맵게
    //힙에 관한 문제라 힙 정렬 구현과 관련되려나 하고 쫄았는데 그거랑 전혀 관련없는 문제
    //우선순위 큐가 힙 정렬로 구현할 수 있기에 힙 문제라고 적혀있는듯
    //문제 자체는 어렵지 않았다
    public int solution(int[] scoville, int K) {
        Queue<Integer> qu = new PriorityQueue<>();
        for(int i : scoville) {
            qu.offer(i);
        }
        int answer = 0;
        while (qu.peek() < K) {
            if(qu.size() == 1) {
                answer = -1;
                break;
            }
            qu.offer(qu.poll() + (qu.poll()*2));
            answer++;
        }
        return answer;
    }
}
