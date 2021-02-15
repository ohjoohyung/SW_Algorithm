package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_15652 {
    static int[] arr;
    static boolean[] check;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        check = new boolean[n+1];
        backTracking(0, 1);

    }
    static void backTracking(int count, int certificate) {
        if (count == m) {
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (certificate <= i) {
                arr[count] = i;
                backTracking(count + 1, i);
            }
        }
    }
}
