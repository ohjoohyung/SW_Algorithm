package programmers.lv3;

import java.util.Arrays;
import java.util.Comparator;

public class Camera_Test {
    //단속카메라
    //그리디 알고리즘 문제
    //다른 사람 풀이
    //내 풀이의 경우 진입지점을 오름차순으로 정렬했는데 그걸 한번 더 비교해주었다.
    //사실 이미 오름차순으로 정렬되어 있기 때문에 굳이 비교를 해줄 필요가 없지않나라고 생각을 하면서도 그냥 비교해서 풀었다.
    //다른 사람 풀이의 경우 내가 생각했던대로 진출지점만 비교해주었기 때문에 이 풀이를 들고왔다.
    public static void main(String[] args) {
        int[][] routes = {{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}};
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int answer = 1;
        int end = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] <= end) {
                if (end >= routes[i][1]) {
                    end = routes[i][1];
                }
            } else {
                answer++;
                end = routes[i][1];
            }
        }
        System.out.println(answer);
    }

    //원래 내 풀이
    public int solution(int[][] routes) {
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int answer = 1;
        int start = routes[0][0];
        int end = routes[0][1];
        for (int i = 1; i < routes.length; i++) {
            if ((routes[i][0] >= start && routes[i][0] <= end)
                    && (routes[i][1] >= start && routes[i][1] <= end)) {
                start = routes[i][0];
                end = routes[i][1];
            } else if ((routes[i][0] >= start && routes[i][0] <= end)
                    || (routes[i][1] >= start && routes[i][1] <= end)) {
                start = routes[i][0];
            } else {
                answer++;
                start = routes[i][0];
                end = routes[i][1];
            }
        }
        return answer;
    }
}
