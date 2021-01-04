package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test_2775 {
    public static void main(String[] args) throws IOException {

        //재귀로 풀었다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(method(k,n));

        }

    }

    private static int method(int k, int n) {
        if(k == 0) {
            return n;
        }

        int tmp = 0;
        for(int i = 1; i <= n; i++) {
            tmp += method(k-1, i);
        }
        return tmp;
    }
}
