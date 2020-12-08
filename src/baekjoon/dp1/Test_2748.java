package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2748 {
    //동적계획법 첫번째 문제
    //아무 생각없이 기존의 재귀를 이용한 방식으로 풀었더니 시간 초과가 떴다.
    //값을 저장하여 다시 계산하지 않고 가져다 쓰는 메모리제이션을 활용하여 풀어 해결하였다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+1];
        for(int i=0; i<=n; i++) {
            arr[i] = -1;
        }
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fibonacci(n, arr));
    }

    static long fibonacci(int n, long[] arr) {
        if(arr[n] == -1) {
            arr[n] = fibonacci(n-1, arr) + fibonacci(n-2, arr);
        }
        return arr[n];
    }
}
