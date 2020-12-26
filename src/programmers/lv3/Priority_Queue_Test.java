package programmers.lv3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Test {
    //이중우선순위큐
    //자바에 있는 우선순위 큐를 이용하여 해결
    public int[] solution(String[] operations) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < operations.length; i++) {
            String[] operation = operations[i].split(" ");
            if (operation[0].equals("I")) {
                queue.add(Integer.parseInt(operation[1]));
            }else {
                if (operation[1].equals("1")) {
                    if (!queue.isEmpty()) {
                        Queue<Integer> tmpQueue = new PriorityQueue<>();
                        while (!queue.isEmpty()) {
                            int tmpNumber = queue.poll();
                            if (!queue.isEmpty()) {
                                tmpQueue.add(tmpNumber);
                            }
                        }
                        queue = tmpQueue;
                    }
                }else {
                    if (!queue.isEmpty()) {
                        queue.poll();
                    }
                }
            }
        }
        int[] answer = new int[2];
        if (!queue.isEmpty()) {
            answer[1] = queue.poll();
            if (queue.isEmpty()) {
                answer[0] = answer[1];
            }else {
                int max = 0;
                while (!queue.isEmpty()) {
                    max = queue.poll();
                }
                answer[0] = max;
            }
        }
        return answer;
    }
}
