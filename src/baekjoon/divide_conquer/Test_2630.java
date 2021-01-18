package baekjoon.divide_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_2630 {
    //분할 정복 문제
    //분할한 뒤 색이 같은지 검사하고 카운트해준다는 것은 파악했지만
    //구현을 하지 못해서 검색 후 해결했다.
    //재귀를 생각했어야 했는데.. 아무래도 분할 정복을 제대로 푸는 것은 처음이라 그런가 구현이 어려웠다. 익숙해지자.
    //근데 왜 이 문제 어디서 본거같지..
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        countPaper(paper, n, 0, 0);
        System.out.println(white);
        System.out.println(blue);
    }

    static void countPaper(int[][] paper, int n, int x, int y) {
        if (isAllSame(paper, n, x, y)) {
            if (paper[y][x] == 0) {
                white++;
            }else {
                blue++;
            }
            return;
        }
        countPaper(paper, n/2, x, y);
        countPaper(paper, n/2, x+n/2, y);
        countPaper(paper, n/2, x, y+n/2);
        countPaper(paper, n/2, x+n/2, y+n/2);
    }

    static boolean isAllSame(int[][] paper, int n, int x, int y) {
        int criteria = paper[y][x];
        for (int i = y; i < y + n; i++) {
            for (int j = x; j < x + n; j++) {
                if (paper[i][j] != criteria) return false;
            }
        }
        return true;
    }
}
