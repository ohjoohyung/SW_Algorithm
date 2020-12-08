package baekjoon.dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1003 {
    public static void main(String[] args) throws IOException {
        //피보나치에만 집중한듯..
        //0의 개수와 1의 개수에도 규칙이 존재했고 그걸 저장하는 배열을 만들어 문제를 해결..
        //검색해서 해결..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[41][2];
            arr[0][0] = 1;
//            arr[0][1] = 0;
//            arr[1][0] = 0;
            arr[1][1] = 1;
            for(int j=2; j<41; j++) {
                for(int l=0; l<2; l++) {
                    arr[j][l] = arr[j-1][l] + arr[j-2][l];
                }
            }
            System.out.println(arr[N][0] +" " +arr[N][1]);

        }
    }

}
