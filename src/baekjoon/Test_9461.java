package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] arr = new long[N+1];
            for(int j = 0; j<=N; j++) {
                arr[j] = -1;
            }
            long answer = 0;
            if(N == 1 || N == 2 || N == 3) {
                answer = 1;
            }else if(N == 4 || N == 5) {
                answer = 2;
            }else {
                arr[1] = 1;
                arr[2] = 1;
                arr[3] = 1;
                arr[4] = 2;
                arr[5] = 2;
                answer = method(N, arr);
            }
            System.out.println(answer);
        }
    }

    static long method(int N, long[] arr) {
        if(arr[N] == -1) {
            arr[N] = method(N-5,arr) + method(N-1, arr);
        }
        return arr[N];
    }
}
