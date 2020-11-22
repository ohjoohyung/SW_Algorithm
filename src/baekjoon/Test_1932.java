package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = -1;
            }
        }
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                if(st.hasMoreTokens()) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }else {
                    break;
                }
            }
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j] != -1) {
                    if(j == 0) {
                        arr[i][j] += arr[i-1][j];
                    }else {
                        arr[i][j] += Math.max(arr[i-1][j], arr[i-1][j-1]);
                    }
                }
            }
        }
        int answer = 0;
        for(int i = 0; i<n; i++) {
            if(arr[n-1][i] > answer) {
                answer = arr[n-1][i];
            }
        }
        System.out.println(answer);

    }
}
