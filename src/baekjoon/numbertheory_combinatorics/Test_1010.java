package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1010 {
    //다리 놓기
    //경우의 수 + dp
    //검색 후 해결
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] dp = new int[n+1][m+1];
            for (int j = 1; j <= m; j++) {
                dp[1][j] = j;
            }
            if (n > 1) {
                for (int k = 2; k <= n; k++) {
                    for (int l = k; l <= m; l++) {
                        dp[k][l] =getCount(k, l, dp);
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
    }

    static int getCount(int k, int l, int[][] dp) {
        int count = 0;
        for (int i = l-1; i >= k-1; i--) {
            count += dp[k-1][i];
        }
        return count;
    }
}
