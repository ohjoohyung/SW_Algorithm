package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1011 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            double val = y-x;
            int n = 0;
            int answer = 0;

            n = (int)Math.sqrt(val);

            if(n*n == val) {
                answer = 2*n -1;
            }else if(val <= n*n + n) {
                answer = 2*n;
            }else {
                answer = 2*n+1;
            }


            System.out.println(answer);

        }

    }

}
