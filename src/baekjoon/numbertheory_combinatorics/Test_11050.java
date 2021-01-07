package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Test_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int answer = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(answer);


    }
    static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }


}
