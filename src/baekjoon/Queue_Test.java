package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue_Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
       //10845번
        //MyQueue que = new MyQueue();
//        Queue<Integer> que = new LinkedList<Integer>();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int backVal = -1;
//        for(int i = 0; i<n; i++) {
//            String s = br.readLine();
//            switch(s) {
//                case "front":
//                    if(que.isEmpty()) {
//                        System.out.println(-1);
//                    }else {
//                        System.out.println(que.peek());
//                    }
//                    break;
//                case "size":
//                    System.out.println(que.size());
//                    break;
//                case "empty":
//                    if(que.isEmpty()) {
//                        System.out.println(1);
//                    }else {
//                        System.out.println(0);
//                    }
//                    break;
//                case "pop":
//                    if(que.isEmpty()) {
//                        System.out.println(-1);
//                    }else {
//                        System.out.println(que.poll());
//                    }
//                    break;
//                case "back":
//                    if(que.isEmpty()) {
//                        backVal = -1;
//                    }
//                    System.out.println(backVal);
//                    break;
//                default:
//                    String[] sArr = s.split(" ");
//                    que.add(Integer.parseInt(sArr[1]));
//                    backVal = Integer.parseInt(sArr[1]);
//            }
//        }

        //18258번
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Queue<Integer> que = new LinkedList<>();
//        for(int i = 1; i<=n; i++) {
//            que.add(i);
//        }
//        int index = 1;
//        while(que.size() != 1) {
//            int num = que.poll();
//            if(index % 2 != 1) {
//                que.add(num);
//            }
//            index++;
//        }
//        System.out.println(que.poll());

        //11866번
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        Queue<Integer> que = new LinkedList<>();
//        for(int i = 1; i<=n; i++) {
//            que.add(i);
//        }
//        String s = "<";
//        while (!que.isEmpty()) {
//            for(int i=0; i<k; i++) {
//                int tmp = que.poll();
//                if(i==k-1) {
//                    s+= que.isEmpty() ? tmp+">" : tmp+", ";
//                    break;
//                }
//                que.add(tmp);
//            }
//        }
//        System.out.println(s);


        //1966번
        //프로그래머스에도 똑같은 문제가 있다
        //근데 왜 제대로 하지 못했나... 반성한다
        //핵심은 배열과 큐 출력값을 비교하며 원하는 위치값이 나올때까지 계속 반복하는 것
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < num; i++) {
            String[] sArr1 = br.readLine().split(" ");
            int n = Integer.parseInt(sArr1[0]);
            int m = Integer.parseInt(sArr1[1]);
            String[] sArr2 = br.readLine().split(" ");
            int[] priority = new int[n];

            for(int j = 0; j < n; j++) {
                priority[j] = Integer.parseInt(sArr2[j]);
                que.add(Integer.parseInt(sArr2[j]));
            }
            int answer = 0;
            while (!que.isEmpty()) {
                for(int k = 0; k < n; k++) {
                    if(que.peek() == priority[k]) {
                        que.poll();
                        answer++;
                        if(k == m) {
                            que.clear();
                            break;
                        }
                    }
                }
            }
            System.out.println(answer);


        }
    }
}

class MyQueue {
    int[] arr;
    int front;
    int back;
    public MyQueue() {
        arr = new int[10000];
        front = 0;
        back = 0;
    }
    void push(int n) {
        arr[back++] = n;
    }

    void pop() {
        if(back > 0) {
            System.out.println(arr[front++]);
        }else {
            System.out.println(-1);
        }

        if(front == back) {
            front = 0;
            back = 0;
        }
    }

    void front() {
        if(back > 0) {
            System.out.println(arr[front]);
        }else {
            System.out.println(-1);
        }
    }

    void back() {
        if(back > 0) {
            System.out.println(arr[back-1]);
        }else {
            System.out.println(-1);
        }
    }

    void size() {
        System.out.println(back-front);
    }

    void empty() {
        if(back == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

}
 