package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Test_2004 {
    //2와 5 개수를 카운트 해주기 위해서 그냥 나눠서 나오는 몫만 더하면 됨
    //int로 했다가 범위를 초과해서 전부 long으로 바꿔 해결
    //처음 했던건 시간초과가 떠서 검색 후 해결
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long twoCount = 0;
        long fiveCount = 0;
        twoCount += countTwo(n);
        fiveCount += countFive(n);

        twoCount -= countTwo(m);
        fiveCount -= countFive(m);

        twoCount -= countTwo(n-m);
        fiveCount -= countFive(n-m);

        long answer = Math.min(twoCount, fiveCount);
        System.out.println(answer);
    }

    static long countTwo(long number) {
        long count = 0;
        for (long i = 2; i <= number; i *= 2) {
            count += number / i;
        }
        return count;
    }

    static long countFive(long number) {
        long count = 0;
        for (long i = 5; i <= number; i *= 5) {
            count += number / i;
        }
        return count;
    }

}
