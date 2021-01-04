package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Test_10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++) {
            String answer = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            answer += N % H == 0 ? H : N % H;
            if(N % H == 0) {
                answer += N/H > 9 ? N/H : "0"+N/H;
            }else {
                answer += (N / H)+1 > 9 ? (N / H)+1 : "0"+((N / H)+1);
            }
            System.out.println(answer);
        }

    }

}
