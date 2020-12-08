package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10844 {
    //쉬운 계단 수
    //이름만 쉽지 문제는 안쉬운듯
    //0으로 끝날 때랑 9로 끝날 때는 1개 밖에 추가 안된다는 것만 깨달았지 정작 문제는 다른 방향으로 풀고 있었다
    //조금 더 dp에 친숙해질 필요가 있다
    //이차원 배열로 푸는 방법에도 익숙해지자! 규칙을 찾자!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N+1][10];
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j+1];
                } else if (j == 9) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
                }
                dp[i][j] %= 1000000000;
            }
        }
        long answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += dp[N][i];
        }
        System.out.println(answer % 1000000000);
    }
}
