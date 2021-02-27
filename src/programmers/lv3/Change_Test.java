package programmers.lv3;

import java.util.Arrays;

public class Change_Test {
    //거스름돈
    //dp 문제
    //너무 어려웠다. 처음에 dfs로 접근했다가 아 이건 아니지 싶어서 검색 후 해결했다.
    //풀이를 봐도 처음에는 이해하기 어려웠다.
    //계속 보다보니까 어느정도 이해는 되었는데 여전히 어질어질하다.
    //https://tosuccess.tistory.com/57
    //https://ydeer.tistory.com/59 참고
    public int solution(int n, int[] money) {
        Arrays.sort(money);
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i % money[0] == 0) {
                dp[i] = 1;
            }
        }

        for (int i = 1; i < money.length; i++) {
            for (int j = money[i]; j <= n; j++) {
                dp[j] = (dp[j] + dp[j - money[i]]) % 1000000007;
            }
        }
        return dp[n];
    }
}
