package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_2869 {
    public static void main(String[] args) throws IOException {
        //Scanner 사용하니까 시간 초과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = 1;
        v = v - a;
        day = v%(a-b) == 0 ? v/(a-b) : v/(a-b) + 1;
        System.out.println(day+1);
    }

}
