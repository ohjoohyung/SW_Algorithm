 package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_17488 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][M+1];

        st = new StringTokenizer(br.readLine());
        int[] check = new int[M+1];
        for(int i=1; i<=M; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }

        for(int k=0; k<2; k++) {
            for(int i=1; i<=N; i++) {
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    int tmp = Integer.parseInt(st.nextToken());
                    if(tmp == -1) break;
                    check[tmp]--;
                    arr[i][tmp]++;
                }
            }

            for(int i=1; i<=N; i++) {
                for(int j=1; j<=M; j++) {
                    if(check[j] < 0) {
                        continue;
                    }
                    if(arr[i][j] == 1) {
                        arr[i][j]++;
                    }
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                if(arr[i][j] == 2) {
                    flag = true;
                    sb.append(j +" ");
                }
            }
            if(flag) {
                sb.deleteCharAt(sb.length()-1);
                sb.append("\n");
            }else {
                sb.append("망했어요\n");
            }

            flag = false;
        }
        System.out.println(sb.toString());








    }
}
