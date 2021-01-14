package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test_7562 {
    //처음에 dfs로 접근했다가 실행이 끝이 나지 않는것을 보고 검색해서 bfs로 해결했다.
    //어떤 상황일 때 dfs를 쓰고 bfs를 쓰는지를 아는 연습을 해야겠다.
    //일단 bfs에 적응할 필요가 있다고 생각했음.
    static int[] row = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] col = {-2, -1, 1, 2, -2, -1, 1, 2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int I = Integer.parseInt(br.readLine());
            int[][] map = new int[I][I];
            boolean[][] visited = new boolean[I][I];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            Queue<Point> queue = new LinkedList<>();
            Point startPoint = new Point(startX, startY);
            Point endPoint = new Point(endX, endY);
//            dfs(map, visited, startX, startY, I, 0);
            bfs(map, visited, startPoint, endPoint, I, queue);
            System.out.println(map[endX][endY]);
        }
    }

    static void bfs(int[][] map, boolean[][] visited, Point nowPoint, Point endPoint, int I, Queue<Point> queue) {

        visited[nowPoint.x][nowPoint.y] = true;
        queue.add(nowPoint);
        while (!queue.isEmpty()) {
            if (nowPoint.x == endPoint.x && nowPoint.y == endPoint.y) {
                return;
            }
            Point tmpPoint = queue.poll();
            for (int i = 0; i < 8; i++) {
                int newX = tmpPoint.x + row[i];
                int newY = tmpPoint.y + col[i];
                if (newX >= 0 && newX < I && newY >= 0 && newY < I && !visited[newX][newY]) {
                    queue.add(new Point(newX, newY));
                    visited[newX][newY] = true;
                    map[newX][newY] = map[tmpPoint.x][tmpPoint.y] + 1;
                }
            }
        }

    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

//    static void dfs(int[][] map, boolean[][] visited, int x, int y, int I, int count) {
//        if (map[x][y] == 1) {
//            if (answer == 0) {
//                answer = count;
//            }else {
//                answer = answer > count ? count : answer;
//            }
//            return;
//        }
//        for (int i = 0; i < 8; i++) {
//            int newX = x+row[i];
//            int newY = y+col[i];
//            if (newX < 0 || newX >= I || newY < 0 || newY >= I) continue;
//            if (!visited[newX][newY]) {
//                System.out.println(x+"/"+y+"/"+newX + "/" + newY);
//                visited[newX][newY] = true;
//                dfs(map, visited, newX, newY, I, count+1);
//                visited[newX][newY] = false;
//            }
//        }
//    }
}
