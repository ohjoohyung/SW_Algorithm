package baekjoon.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Test_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tempNumber = Integer.parseInt(br.readLine());
            if (tempNumber == 0) {
                if (queue.isEmpty()) {
                    sb.append(0+"\n");
                }else {
                    sb.append(queue.poll()+"\n");
                }
            }else {
                queue.add(tempNumber);
            }
        }
        System.out.println(sb.toString());
    }
}
