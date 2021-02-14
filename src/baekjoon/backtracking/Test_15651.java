package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_15651 {
    static int n;
    static int m;
    static int arr[];
    public static void main(String[] args) throws IOException {
        //시간초과가 떠서 StringBuilder로 해결
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        StringBuilder sb = new StringBuilder();
        backTracking(0, sb);
        System.out.println(sb.toString());
    }

    static void backTracking(int count, StringBuilder sb) {
        if (count == m) {
            for (int i = 0; i < count; i++) {
                sb.append(arr[i] +" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[count] = i;
            backTracking(count + 1, sb);
        }
    }
}
