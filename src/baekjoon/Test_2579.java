package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2579 {
    public static void main(String[] args) throws IOException {
        //dp 문제는 규칙을 찾는게 중요하다. 직접 써보고 찾아야한다. 점화식!!
        //고민하다가 검색해서 해결..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T+1];
        for(int i=1; i<=T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] maxArr = new int[T+1];
        maxArr[1] = arr[1];
        if(T >= 2) {
            maxArr[2] = arr[1] + arr[2];
        }
        if(T >= 3) {
            maxArr[3] = Math.max(arr[1], arr[2]) + arr[3];
        }
        if(T >= 4) {
            for(int i=4; i<=T; i++) {
                maxArr[i] = Math.max(maxArr[i-2]+arr[i], maxArr[i-3]+arr[i-1]+arr[i]);
            }
        }
        System.out.println(maxArr[T]);


    }
}
