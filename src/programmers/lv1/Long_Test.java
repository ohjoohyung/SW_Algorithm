package programmers.lv1;

import java.util.Scanner;

public class Long_Test {
    //x 변수의 파라미터를 long을 바꾸고 문제를 풀긴 했는데 이렇게 답이 나왔다
    //곱하기를 할때 곱하는 수 둘 중 하나라도 long으로 변환시켜야 오버플로우 되지않고 long 타입으로 값이 잘 나오네
    //이런 기본적인거에서 헤매다니...
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i =0; i < n; i++) {
            answer[i] = x + (long)x*i;
        }
        return answer;
    }
}
