package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {

    //18312번
    //분류 문제인데 경우의 수를 나눠서 전체 수 - 포함되지 않은 수로 풀었다다
   public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        int h = 0;
        for(int i = 0; i <= n; i++) {
            if(i / 10 == k || i % 10 == k) {
                continue;
            }
            h++;
        }

        int allCount = (n+1)*6*10*6*10;
        int exCount;
        if(k <= n) {
            exCount = k > 5 ? h*54*54 : h*45*45;
        }else {
            exCount = k > 5 ? h*54*54 : h*45*45;
        }
        int answer = allCount - exCount;

        System.out.println(answer);
    }

}

