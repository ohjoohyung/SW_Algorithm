package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Test_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            int gcdValue = getGCDValue(numbers[0], numbers[i]);
            System.out.println(numbers[0] / gcdValue + "/" + numbers[i] / gcdValue);
        }

    }
    static int getGCDValue(int first, int second) {
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
