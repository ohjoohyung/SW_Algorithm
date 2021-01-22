package baekjoon.divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1780 {
    static int minusOneCount = 0;
    static int zeroCount = 0;
    static int oneCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] field = new int[n][n];
        for (int i=0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        countNumbers(field, n, 0, 0);
        System.out.println(minusOneCount);
        System.out.println(zeroCount);
        System.out.println(oneCount);

    }
    static void countNumbers(int[][] field, int n, int x, int y) {
        if (isAllSame(field, n, x, y)) {
            int criteria = field[y][x];
            if (criteria == -1) {
                minusOneCount++;
            }else if (criteria == 0) {
                zeroCount++;
            }else {
                oneCount++;
            }
            return;
        }

        countNumbers(field, n/3, x, y);
        countNumbers(field, n/3, x+n/3, y);
        countNumbers(field, n/3, x+(n/3 * 2), y);
        countNumbers(field, n/3, x, y+n/3);
        countNumbers(field, n/3, x+n/3, y+n/3);
        countNumbers(field, n/3, x+(n/3 * 2), y+n/3);
        countNumbers(field, n/3, x, y+(n/3 * 2));
        countNumbers(field, n/3, x+n/3, y+(n/3 * 2));
        countNumbers(field, n/3, x+(n/3 * 2), y+(n/3 * 2));

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
