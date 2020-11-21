package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_4097 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            long[] dp = new long[N+1];
            long max = -10001;
            for(int i=1; i<=N; i++) {
                dp[i] = Integer.parseInt(br.readLine());

//				if(dp[i-1] >= 0) {
//					dp[i] = dp[i-1]+val;
//				}

                dp[i] = dp[i] >= dp[i - 1] + dp[i] ? dp[i] : dp[i - 1] + dp[i];

                if(dp[i] > max) {
                    max = dp[i];
                }
            }

            System.out.println(max);
        }
    }

}
