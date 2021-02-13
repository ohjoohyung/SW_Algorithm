package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_15650 {
    static int n;
    static int[] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        check = new boolean[n+1];
        backTracking(1, m);
    }

    static void backTracking(int start, int m) {
        if (m == 0) {
            for (int i = 1; i <= n; i++) {
                if (check[i]) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            check[i] = true;
            backTracking(i + 1, m - 1);
            check[i] = false;
        }
    }
}
