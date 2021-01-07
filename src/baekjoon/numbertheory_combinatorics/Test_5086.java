package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            String answer = "neither";
            if(b % a == 0) answer = "factor";
            if(a % b == 0) answer = "multiple";
            System.out.println(answer);
        }
    }
}
