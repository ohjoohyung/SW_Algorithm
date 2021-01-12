package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1189 {
    static int[] row = {-1, 0, 1, 0};
    static int[] col = {0, 1, 0, -1};
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[][] map = new char[r][c];
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String input = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = input.charAt(j);
            }
        }
        visited[r-1][0] = true;
        move(map, r-1, 0, visited, r, c, k, 1);
        System.out.println(answer);
    }

    static void move(char[][] map, int x, int y, boolean[][] visited, int r, int c, int k, int length) {
        if (k == length) {
            if (x == 0 && y == c-1) {
                answer++;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x+row[i];
            int newY = y+col[i];

            if (newX >= r || newX < 0 || newY >= c || newY < 0) continue;
            if (!visited[newX][newY] && map[newX][newY] != 'T') {
                visited[newX][newY] = true;
                move(map, newX, newY, visited, r, c, k, length+1);
                visited[newX][newY] = false;
            }
        }

    }
}
