package baekjoon.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test_11286 {
    //절댓값 힙
    //Value 클래스 만들고 Comparator의 compare 메소드 구현해서 해결
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Value> queue = new PriorityQueue<>(new Comparator<Value>() {
            @Override
            public int compare(Value o1, Value o2) {
                if (o1.absoluteValue == o2.absoluteValue) {
                    return o1.realValue - o2.realValue;
                }
                return o1.absoluteValue - o2.absoluteValue;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tempNumber = Integer.parseInt(br.readLine());
            if (tempNumber == 0) {
                if (queue.isEmpty()) {
                    sb.append(0+"\n");
                } else {
                    sb.append(queue.poll().realValue+"\n");
                }
            } else {
                queue.add(new Value(tempNumber, Math.abs(tempNumber)));
            }
        }
        System.out.println(sb.toString());
    }

    static class Value {
        int realValue;
        int absoluteValue;
        Value(int realValue, int absoluteValue) {
            this.realValue = realValue;
            this.absoluteValue = absoluteValue;
        }
    }
}
