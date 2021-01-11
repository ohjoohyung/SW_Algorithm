package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = br.readLine().split(" "); //입력받고 공백으로 나누기

        //StringTokenizer를 사용해보았다
        StringTokenizer st = new StringTokenizer(br.readLine());
        //        int n = Integer.parseInt(s[0]); //n개 동전
//        int k = Integer.parseInt(s[1]); //k원
        int n = Integer.parseInt(st.nextToken()); //n개 동전
        int k = Integer.parseInt(st.nextToken()); //k원
        int[] coinArr = new int[n]; //동전들의 배열
        for (int i = 0; i < n; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
//            if(coinArr[i] > k) {
//                continue;
//            }
//            count += k / coinArr[i];
//            k = k % coinArr[i];

            //왜 굳이 continue를 사용해서 코드를 늘렸을까
            if (coinArr[i] <= k) {
                count += k / coinArr[i];
                k = k % coinArr[i];
            }
        }
    }
}
