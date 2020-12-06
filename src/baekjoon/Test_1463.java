package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int answer = 0;
        if (N == 1) {
            answer = 0;
        }else if (N == 2) {
            answer = 1;
        }else if (N == 3) {
            answer = 1;
        }else {
            dp[2] = 1;
            dp[3] = 1;
            for (int i=4; i<=N; i++) {
                int min1 = Integer.MAX_VALUE;
                if (i % 2 == 0) {
                    min1 = dp[i/2] + 1;
                }
                if (i % 3 == 0) {
                    min1 = Math.min(min1, dp[i/3] + 1);
                }
                int min2 = Integer.MAX_VALUE;
                min2 = dp[i-1] + 1;
                dp[i] = Math.min(min1, min2);
            }
            answer = dp[N];
        }
        System.out.println(answer);
    }
}
