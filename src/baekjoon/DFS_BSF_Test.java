package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BSF_Test {
    static int n;
    static int[][] arr;
    static List<List<Integer>> list;
    static boolean[][] isVisited;
    static int count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //3098번
        //애초에 dfs bfs 문제가 아닌데 괜히 그쪽으로 접근하다 어려웠던것 같다
        //구글 검색 후 문제를 해결하였다
        //핵심은 행렬을 잘 사용해야 한다는 것. (1,2) (2,3)이 친구일때 (1,3)이 친구가 된다는 것
        //그리고 i > l이라는 조건을 사용해 행렬을 기준으로 오른쪽 위의 값만 따진다는것
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int val = 1;
        arr = new int[n + 1][n + 1];
        int total = 0;
        int before = 0;
        for (int i = 0; i < m; i++) {
            String[] items = br.readLine().split(" ");
            int a = Integer.parseInt(items[0]);
            int b = Integer.parseInt(items[1]);
            arr[a][b] = val;
            arr[b][a] = val;
            total++;
        }

        int answer = 0;
        List<Integer> totalList = new ArrayList<>();

        while (true) {
            before = total;
            val++;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr[i][j] > 0 && arr[i][j] < val) {
                        for (int l = 1; l <= n; l++) {
                            if (arr[j][l] > 0 && arr[j][l] < val && i < l) {
                                if (arr[i][l] == 0) {
                                    arr[i][l] = val;
                                    arr[l][i] = val;
                                    total++;
                                }
                            }
                        }
                    }
                }
            }
            answer = total - before;
            totalList.add(answer);

            if (total == (n * (n - 1)) / 2) {
                break;
            }

        }
        System.out.println(totalList.size());
        for (Integer i : totalList) {
            System.out.println(i);
        }

    }
}
