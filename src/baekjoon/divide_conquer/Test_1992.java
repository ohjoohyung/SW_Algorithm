package baekjoon.divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1992 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] field = new int[n][n];
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < tmp.length(); j++) {
                field[i][j] = tmp.charAt(j)-'0';
            }
        }
        compress(field, n, 0, 0);
        System.out.println(sb.toString());
    }

    static void compress(int[][] field, int n, int x, int y) {
        if (isAllSame(field, n, x, y)) {
            sb.append(field[y][x]);
            return;
        }
        sb.append("(");
        compress(field, n/2, x, y);
        compress(field, n/2, x+n/2, y);
        compress(field, n/2, x, y+n/2);
        compress(field, n/2, x+n/2, y+n/2);
        sb.append(")");
    }

    static boolean isAllSame(int[][] field, int n, int x, int y) {
        int criteria = field[y][x];
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                if (field[i][j] != criteria) {
                    return false;
                }
            }
        }
        return true;
    }
}
