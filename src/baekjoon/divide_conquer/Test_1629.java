package baekjoon.divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1629 {
    //분할정복 거듭제곱 문제
    //거듭제곱을 분할정복으로 해결할 수 있다는 것과 더불어서
    //(a+b)%c = (a%c + b%c)%c 라는 것도 잘 알아두자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(pow(a,b,c) % c);
    }

    static long pow(int a, int b, int c) {
        if (b == 0) {
            return 1;
        }

        long n = pow(a, b / 2, c);
        long tmp = (n * n) % c;
        if (b % 2 == 0) {
            return tmp;
        }else {
            return (tmp * a) % c;
        }
    }
}
