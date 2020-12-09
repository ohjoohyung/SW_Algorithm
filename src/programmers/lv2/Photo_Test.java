package programmers.lv2;

import java.util.HashMap;
import java.util.Map;

public class Photo_Test {
    //단체사진 찍기 문제
    //순열을 이용하여 푸는 문제
    //검색하여 다른 사람 풀이를 참고하고 해결했다..
    //순열도 생각할 줄 알아야한다..
    //그리고 HashMap을 자유자재로 쓰도록 노력하자
    public int solution(int n, String[] data) {
        map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('F', 2);
        map.put('J', 3);
        map.put('M', 4);
        map.put('N', 5);
        map.put('R', 6);
        map.put('T', 7);
        arr = new int[8];
        visited = new boolean[8];
        count = 0;
        perm(0, data);
        return count;
    }
    static Map<Character, Integer> map;
    static int[] arr;
    static boolean[] visited;
    static int count;

    static void perm(int depth, String[] data) {
        if (depth == 8) {
            int c1;
            int c2;
            char sign;
            int num;
            for (int i = 0; i < data.length; i++) {
                c1 = arr[map.get(data[i].charAt(0))];
                c2 = arr[map.get(data[i].charAt(2))];
                sign = data[i].charAt(3);
                num = data[i].charAt(4) - '0';

                if (sign == '<') {
                    if (Math.abs(c1-c2) - 1 >= num) {
                        return;
                    }
                }else if (sign == '>') {
                    if (Math.abs(c1-c2) - 1 <= num) {
                        return;
                    }
                }else {
                    if (Math.abs(c1-c2) - 1 != num) {
                        return;
                    }
                }
            }
            count++;
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                arr[depth] = i;
                visited[i] = true;
                perm(depth+1, data);
                visited[i] = false;
            }
        }
    }
}
