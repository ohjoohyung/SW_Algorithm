package programmers.lv3;

import java.util.*;

public class Farthest_Node_Test {
    //가장 먼 노드
    //bfs로 해결
    //처음에 인접 행렬로 풀어보니까 메모리 초과가 떠서 인접 리스트로 바꿔 해결함.
    //케이스 개수로 얼마만큼의 메모리가 사용될지 계산해서 푸는 연습이 필요한듯.
    public int solution(int n, int[][] edge) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(i, new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            int startNode = edge[i][0];
            int endNode = edge[i][1];
            list.get(startNode).add(endNode);
            list.get(endNode).add(startNode);
        }
        boolean[] visited = new boolean[n+1];
        int[] distance = new int[n+1];
        bfs(list, visited, distance);
        Arrays.sort(distance);
        int answer = 0;
        int max = distance[n];
        for (int i = n; i >= 1; i--) {
            if (max != distance[i]) break;
            answer++;
        }
        return answer;
    }

    static void bfs(List<List<Integer>> list, boolean[] visited, int[] distance) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            List<Integer> tmpList = list.get(tmp);
            for (int i = 0; i < tmpList.size(); i++) {
                if (!visited[tmpList.get(i)]) {
                    visited[tmpList.get(i)] = true;
                    queue.add(tmpList.get(i));
                    distance[tmpList.get(i)] = distance[tmp] + 1;
                }
            }
        }
    }
}
