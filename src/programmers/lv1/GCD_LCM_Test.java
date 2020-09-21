package programmers.lv1;

import java.math.BigInteger;
import java.util.Scanner;

public class GCD_LCM_Test {
    //최대공약수, 최소공배수 구하는 문제
    //최대공약수는 두 수 중 작은 수를 기준으로 for문을 돌며 나눠서 나머지가 0이 되는 수를 찾는 방식으로 해결했고
    //최소공배수는 두 수를 곱하고 최대공약수로 나누면 나오기에 간단하게 해결했다
    //최대공약수의 경우 유클리드 호제법을 이용해 풀어도 좋다
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int smallN = n <= m ? n : m;
        for(int i = smallN; i >= 1; i--) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }

        answer[1] = (n * m) / answer[0];
        return answer;
    }

}
