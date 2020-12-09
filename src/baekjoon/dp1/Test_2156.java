package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2156 {
    //포도주 시식
    //전에 계단 문제와 비슷한 문제
    //당시에는 무조건 마지막 칸을 밟아야한다는 규칙이 있었는데 이건 없다.
    //그래서 자기 자신이 포함되지 않는 바로 앞 dp값과도 비교를 해주어야함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] maxArr = new int[n];
        maxArr[0] = arr[0];
        if (n >= 2) {
            maxArr[1] = arr[0] + arr[1];
        }
        if (n >= 3) {
            maxArr[2] = Math.max(maxArr[1], Math.max(arr[0], arr[1]) + arr[2]);
        }
        if (n >= 4) {
            for (int i = 3; i < n; i++) {
                maxArr[i] = Math.max(maxArr[i-1], Math.max(maxArr[i-3] + arr[i] + arr[i-1], maxArr[i-2] + arr[i]));
            }
        }
        System.out.println(maxArr[n-1]);



    }
}
