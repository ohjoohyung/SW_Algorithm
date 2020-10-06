package programmers.lv2;

import java.util.*;

public class Printer_Test {
    //처음 풀이 방법대로 해봤으나 시간초과가 떠서 또 구글검색 후 우선순위 큐로 풀길래 참고해서 가져왔다
    //핵심은 for문을 돌며 현재 qu.peek(가장 큰 수)와 배열 값을 비교하여 같을 때 poll을 하고 answer++를 해주는 것
    //또한 이 때 location(index)이 배열 index랑 같을 때 break하고 return 해주도록 했다
    //근데 꼭 우선순위 큐를 안써도 풀 수 있더라..
    //좀 더 스택과 큐를 유연하게 활용할 수 있도록 해야겠다
    public int anotherSolution(int[] priorities, int location) {
        Queue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            qu.offer(priorities[i]);
        }
        int answer = 0;
        while (!qu.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(qu.peek() == priorities[i]) {
                    qu.poll();
                    answer++;
                    if(location == i) {
                        qu.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }


    //이 방법인데 location을 줄어나가며 비교하더라
    //이해하고 감탄이 나왔다
    public int otherSolution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }


    //내가 시도해본 방법인데 for문을 너무 많이 돌다보니 시간초과가 떴다
    public int solution(int[] priorities, int location) {
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            qu.offer(priorities[i]);
        }
        int rank = 1;
        int answer = 0;
        for (int i = 0; i < priorities.length; i++) {
            boolean maxFirst = true;
            for (int j = 0; j < priorities.length; j++) {
                if (qu.peek() < priorities[j]) {
                    int tmp = qu.peek();
                    qu.poll();
                    qu.offer(tmp);
                    maxFirst = false;
                    break;
                }
            }
            if (maxFirst) {
                if(i == location) {
                    answer = rank;
                }
                qu.poll();
                rank++;
                priorities[i] = 0;
            }
            if(qu.isEmpty()) {
                break;
            }
            if(i == priorities.length-1) {
                i = -1;
            }
        }
        return answer;
    }
}



