package baekjoon.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tempNumber = Integer.parseInt(br.readLine());
            //우선 maxHeap에 넣고 maxHeap의 최댓값을 추출하여 minHeap에 넣어줌
            maxHeap.add(tempNumber);
            minHeap.add(maxHeap.poll());
            //만약 minHeap의 크기가 더 크다 싶으면 minHeap의 최솟값을 추출하여 maxHeap에 넣어줌으로써
            //크기를 조절함
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
            //전체 수가 짝수든 홀수든 maxHeap의 최댓값을 추출함으로써 중간값 또는 중간에 있는 두 숫자 중 왼쪽값을 출력함
            sb.append(maxHeap.peek()+"\n");
        }
        System.out.println(sb.toString());
    }
}
