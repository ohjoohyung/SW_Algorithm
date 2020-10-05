package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Test {
    //다리를 지나는 트럭
    //무쟈게 쩔쩔맸다...
    //처음 생각하고 짰던게 제대로 되지 않았고 계속 생각하다가 구글 검색해서 참고해서 풀었다
    //핵심은 0을 이용해서 트럭을 끝까지 밀어야된다는 것인듯
    //그리고 마지막에 bridge_length를 더하는 이유는 지금 다리에 있는 트럭이 다리를 건너기 위해서 더해주는것
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> qu = new LinkedList();
        int index = 0;
        int answer = 0;
        int nowWeight = 0;
        while(index < truck_weights.length) {
            if(qu.isEmpty()) {
                nowWeight += truck_weights[index];
                qu.offer(truck_weights[index++]);
                answer++;
            }else if(qu.size() == bridge_length) {
                nowWeight -= qu.poll();
            }else {
                if(truck_weights[index] + nowWeight > weight) {
                    qu.offer(0);
                }else {
                    nowWeight += truck_weights[index];
                    qu.offer(truck_weights[index++]);
                }
                answer++;
            }
        }
        return answer + bridge_length;
    }
}

//이런식으로 클래스 따로 빼서 푸는 방법도 있더라
//정말 대단한거같다
//이렇게 짜는거야말로 자바를 자바답게 잘 이용하는 경우지 않을까..
class Solution {
    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }

    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truckWeights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int curWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
            answer++;

            if (moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for (Truck t : moveQ) {
                t.moving();
            }

            if (moveQ.peek().move > bridgeLength) {
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }

            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }

        return answer;
    }
}
