package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test_7576 {
    static int[] rRow = {1,-1,0,0};
    static int[] rCol = {0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        Queue<Point> que = new LinkedList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                int val = Integer.parseInt(st.nextToken());
                if(val == 0) val = Integer.MAX_VALUE;
                if(val == 1) que.add(new Point(i,j,0));
                map[i][j] = val;
            }
        }

        int size, curRow, curCol, newRow, newCol, day = 1;
        Point tmpPoint;
        while (!que.isEmpty()) {
            size = que.size();
            while (--size >= 0) {
                tmpPoint = que.poll();
                curRow = tmpPoint.x;
                curCol = tmpPoint.y;
                day = tmpPoint.day;
                for(int i=0; i<4; i++) {
                    newRow = curRow + rRow[i];
                    newCol = curCol + rCol[i];
                    if(newRow < 0 || newRow >= N || newCol < 0 || newCol >= M) continue;
                    if(day+1 >= map[newRow][newCol]) continue;
                    if(map[newRow][newCol] == Integer.MAX_VALUE) {
                        que.add(new Point(newRow, newCol, day+1));
                        map[newRow][newCol] = day+1;
                    }
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == Integer.MAX_VALUE) {
                    day = -1;
                    break;
                }
            }
        }
        System.out.println(day);


    }

    public static class Point {
        int x;
        int y;
        int day;
        Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
