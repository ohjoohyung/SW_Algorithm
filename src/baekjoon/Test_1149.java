package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1149 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int tmp = 0;
        int answer = Integer.MAX_VALUE;

        for(int i=1; i<N; i++) {
            arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
        }

        for(int i=0; i<3; i++) {
            answer = answer > arr[N-1][i] ? arr[N-1][i] : answer;
        }
        System.out.println(answer);
//        for(int i=0; i<3; i++) {
//            tmp = arr[0][i];
//            int index = i;
//            for(int j=1; j<N; j++) {
//                int min = Integer.MAX_VALUE;
//                for(int k=0; k<3; k++) {
//                    if(k != index) {
//                        if(tmp + arr[j][k] < min) {
//                            min = tmp + arr[j][k];
//                            index = k;
//                        }
//
//                    }
//                }
//                tmp = min;
//            }
//            answer = tmp < answer ? tmp : answer;
//        }



    }

}
