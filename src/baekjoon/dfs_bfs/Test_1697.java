package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test_1697 {
    //BFS문제
    //방문체크 할때 숫자 범위를 꼭 지정하자
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int answer = 0;
        boolean[] check = new boolean[1000001];

        Queue<Point> que = new LinkedList<>();
        que.add(new Point(N, 0));
        check[N] = true;
        while (!que.isEmpty()) {
            Point tmpPoint = que.poll();
            if(tmpPoint.number == K) {
                answer = tmpPoint.time;
                break;
            }

            int[] tmpArr = {tmpPoint.number-1, tmpPoint.number+1, tmpPoint.number*2};
            for(int i=0; i<3; i++) {
                if(tmpArr[i]>=0 && tmpArr[i]< check.length && !check[tmpArr[i]]) {
                    que.add(new Point(tmpArr[i], tmpPoint.time+1));
                    check[tmpArr[i]] = true;
                }
            }

        }

        System.out.println(answer);
    }

    static class Point {
        int number;
        int time;
        Point(int number, int time) {
            this.number = number;
            this.time = time;
        }
    }
}
