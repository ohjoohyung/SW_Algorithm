package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Test_2108 {
    //처음에 퀵소트 구현해서 풀었다가 시간초과 떠서 Arrays.sort 이용해서 풀었다..
    //시간 너무 소비한거 같다..
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] check = new int[8001];

        double sum = 0;
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            check[arr[i]+4000]++;
        }
        Arrays.sort(arr);
        System.out.println(Math.round(sum / N));
        System.out.println(arr[N/2]);

        int mode = 0;
        int cnt = 0;
        boolean flag = false;
        for(int i=0; i<8001; i++) {
            if(check[i] > cnt) {
                flag = true;
                cnt = check[i];
                mode = i-4000;
            }else if(check[i] == cnt && flag) {
                mode = i-4000;
                flag = false;
            }
        }

        System.out.println(mode);
        System.out.println(arr[N-1]-arr[0]);


    }

}
