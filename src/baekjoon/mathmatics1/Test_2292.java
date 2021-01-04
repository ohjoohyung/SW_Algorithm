package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer=1;
        while (true) {
            if(n==1) {
                answer=0;
                break;
            }
            if(3*(int)Math.pow(answer,2) - 3*answer + 2 <= n &&
                    3*(int)Math.pow(answer+1,2) - 3*(answer+1) + 2 > n) {
                break;
            }
            answer++;
        }
        System.out.println(answer+1);


    }
}
