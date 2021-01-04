package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 3000;

        for(int i = 0; i <= n/3; i++) {
            for(int j = 0; j <= n/5; j++) {
                if(3*i + 5*j == n) {
                    if(i+j < answer) {
                        answer = i+j;
                    }
                }
            }
        }
        if(answer == 3000) answer = -1;
        System.out.println(answer);

    }
}
