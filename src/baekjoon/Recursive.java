package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        makeStar(0,0,n,false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    static void makeStar(int x, int y, int n, boolean blank) {

        //공백일 경우
        if(blank) {
            for(int i = x; i < x + n; i++) {
                for(int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        //더이상 쪼갤 수 없을 때
        if(n == 1) {
            arr[x][y] = '*';
            return;
        }


        int size = n / 3;
        int count = 0;
        for(int i = x; i < x+n; i += size) {
            for(int j = y; j < y+n; j += size) {
                count++;
                if(count == 5) { //공백일때
                    makeStar(i,j,size,true);
                }else {
                    makeStar(i,j,size,false);
                }
            }
        }

    }
}
