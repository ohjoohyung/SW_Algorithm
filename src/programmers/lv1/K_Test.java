package programmers.lv1;

import java.util.Arrays;

public class K_Test {
    //K번째 수
    //정렬을 라이브러리 말고 다른 방식을 사용해서 풀어봐야겠다
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            int t = 0;
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                arr[t++] = array[j];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}
