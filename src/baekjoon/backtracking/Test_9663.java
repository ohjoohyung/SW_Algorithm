package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_9663 {
    //N-Queen
    //처음에 이차원배열을 이용해 dfs로 풀면 되지 않을까 했는데 복잡해서 끝까지 구현하지 못했다.
    //검색해서 블로그 글을 통해 해결하였다.
    //https://st-lab.tistory.com/118 참고
    static int answer = 0;
    static int n;
    static int[]map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n];
        nQueen(0);
        System.out.println(answer);

    }

    private static void nQueen(int depth) {
        if (depth == n) {
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
            map[depth] = i;
            if (isPossible(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    private static boolean isPossible(int col) {
        for (int i = 0; i < col; i++) {
            //같은 행일 경우
            if (map[i] == map[col]) {
                return false;
            //행의 차와 열의 차이가 같은 경우 (대각선)
            }else if (Math.abs(col - i) == Math.abs(map[col] - map[i])) {
                return false;
            }
        }
        return true;
    }


}
