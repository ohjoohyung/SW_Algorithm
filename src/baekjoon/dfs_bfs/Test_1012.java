package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1012 {
    static int answer = 0;
    static int[] rRow = {1,-1,0,0};
    static int[] rCol = {0,0,1,-1};
    static int M;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] map = new int[M][N];

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                map[X][Y] = 1;
            }


            boolean[][] check = new boolean[M][N];

            for(int l=0; l<M; l++) {
                for(int k=0; k<N; k++) {
                    if(map[l][k] == 1 && !check[l][k]) {
                        dfs(l,k,map,check);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
            answer = 0;
        }
    }

    static void dfs(int x, int y, int[][] map, boolean[][] check) {
        check[x][y] = true;
        for(int i=0; i<4; i++) {
            int newX = x + rRow[i];
            int newY = y + rCol[i];
            if(newX < 0 || newX >= M || newY < 0 || newY >= N) continue;
            if(map[newX][newY] == 1 && !check[newX][newY]) dfs(newX, newY, map, check);
        }
    }
}
