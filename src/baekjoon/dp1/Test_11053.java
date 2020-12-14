package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_11053 {
    //가장 긴 증가하는 부분수열
    //dp 문제
    //이중 for문이긴 하지만 개수가 그렇기 많지않아 O(N2)도 가능함
    //이전 배열과 dp 배열을 조사하면서 dp 값을 증가시키면 되는 문제
    //역시 생각하는게 어렵다.. 검색후 해결..
    //최장 증가 부분 수열 문제는 나름 많이 나오는 것 같으니 알아두자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];

        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i] && dp[j] >= dp[i]) {
                    dp[i]++;
                }
            }
        }
        int max = 0;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        System.out.println(max);


    }
}
