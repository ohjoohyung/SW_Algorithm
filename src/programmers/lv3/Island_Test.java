package programmers.lv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Island_Test {
    //섬 연결하기
    //union-find (합집합 찾기)와 크루스칼 알고리즘을 활용하여 푸는 문제
    //https://m.blog.naver.com/ndb796/221230967614 (union-find)
    //https://m.blog.naver.com/ndb796/221230994142 (크루스칼 알고리즘)
    //블로그 글을 참고하였다.
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        List<Edge> edges = new ArrayList<>();
        for (int[] cost : costs) {
            edges.add(new Edge(cost[0], cost[1], cost[2]));
        }
        Collections.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.value - o2.value;
            }
        });

        for (Edge edge : edges) {
            //순환을 하지 않는다면
            if (!findParent(parent, edge.from, edge.to)) {
                answer += edge.value;
                unionParent(parent, edge.from, edge.to);
            }
        }
        return answer;
    }

    static class Edge {
        int from;
        int to;
        int value;

        Edge(int from, int to, int value) {
            this.from = from;
            this.to = to;
            this.value = value;
        }
    }

    //부모 노드를 찾음 (재귀를 통해)
    static int getParent(int[] parent, int node) {
        if (parent[node] == node) return node;
        return parent[node] = getParent(parent, parent[node]);
    }

    //각각의 부모 노드를 찾고 수를 비교하여 작은 쪽을 부모로 지정함
    static void unionParent(int[] parent, int node1, int node2) {
        node1 = getParent(parent, node1);
        node2 = getParent(parent, node2);
        if (node1 < node2) {
            parent[node2] = node1;
        }else {
            parent[node1] = node2;
        }
    }

    //같은 부모인지를 찾는 메소드 (같은 그래프인지 즉, 순환하는지)
    static boolean findParent(int[] parent, int node1, int node2) {
        node1 = getParent(parent, node1);
        node2 = getParent(parent, node2);
        return node1 == node2;
    }
}
