package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test_2667 {
    static int N;
    static int areaSize = 0;
    static int[] moveRow = {1,-1,0,0};
    static int[] moveCol = {0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++) {
            String[] line = br.readLine().split("");
            for(int j=0; j<line.length; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }
        boolean[][] check = new boolean[N][N];


        List<Integer> list = new ArrayList<>();
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map.length; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    method(i, j, map, check);
                    list.add(areaSize);
                    areaSize = 0;
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(Integer i: list) {
            System.out.println(i);
        }

    }

    static void method(int x, int y,int[][] map, boolean[][] check) {

        check[x][y] = true;
        areaSize++;

        for(int i = 0; i<4; i++) {

            int newX = x+moveRow[i];
            int newY = y+moveCol[i];


            if(newX < 0 || newX >= N || newY < 0|| newY >= N) continue;

            if(map[newX][newY] == 1 && !check[newX][newY]) {
                method(newX, newY, map, check);
            }
        }
    }
}

