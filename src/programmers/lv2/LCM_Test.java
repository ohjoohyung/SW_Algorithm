package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class LCM_Test {
    //N개의 최소공배수
    //마지막 테스트케이스가 실패떠서 int를 long으로 바꾸고 해결함
    //근데 테스트케이스에 있는거만 맞춘거지 100브타 96까지 15개 넣으면 오버플로우 떠서 안돌아감..
    public int solution(int[] arr) {
        Queue<Long> que = new LinkedList<>();
        for(int i=0; i<arr.length; i++) {
            que.add((long)arr[i]);
        }

        long val1;
        long val2;
        while (true) {
            val1 = que.poll();
            if(que.isEmpty()) {
                break;
            }
            val2 = que.poll();
            long mul = val1*val2;
            System.out.println(mul);

            while(val1 % val2 != 0) {
                long tmp = val1 % val2;
                val1 = val2;
                val2 = tmp;
            }

            long LCM = mul / val2;
            que.add(LCM);
        }
        return (int)val1;
    }
}
