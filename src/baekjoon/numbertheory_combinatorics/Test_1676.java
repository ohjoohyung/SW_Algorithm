package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1676 {
    //이렇게 풀었는데 굳이 10을 따지지 않고 2와 5만 따져도 똑같은 답이 나온다.
    //그래서 10을 뺀 걸로 수정
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] count = new int[2];
        for (int i = n; i >= 1; i--) {
            int tmpNumber = i;
            while (true) {
                if (tmpNumber % 2 == 0) {
                    count[0]++;
                    tmpNumber /= 2;
                }else if (tmpNumber % 5 == 0) {
                    count[1]++;
                    tmpNumber /= 5;
                }

                if (tmpNumber % 2 != 0 && tmpNumber % 5 != 0) {
                    break;
                }
            }
        }
        answer += Math.min(count[0], count[1]);
        System.out.println(answer);

    }


}
