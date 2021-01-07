package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Test_2981 {
    //검문
    //공약수를 구하는 문제인데 나머지가 같다는 것에 초점을 맞추어 앞 뒤 값을 뺀 수 끼리 공약수를 구하면 되는 문제
    //생각을 하지 못하였기에 검색해서 해결..
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        int gcdValue = numbers[1] - numbers[0];
        for (int i = 2; i < N; i++) {
            gcdValue = getGCDValue(gcdValue, numbers[i] - numbers[i-1]);
        }

        for (int i = 2; i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                System.out.print(i + " ");
            }
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
