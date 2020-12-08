package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1904 {
    //DP문제 메모리제이션 활용
    //N>=2일때만 arr[2]=2 가 되도록 해줌으로써 런타임에러 해결
    static final int NUM = 15746;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N+1];
        arr[1] = 1;
        if(N>=2) {
            arr[2] = 2;
        }
        for(int i=3; i<=N; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%NUM;
        }

        System.out.println(arr[N]);


    }


}
