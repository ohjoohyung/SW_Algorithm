package programmers.lv1;

import java.util.Arrays;
import java.util.HashSet;

public class Plus_Test {
    //두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                h.add(numbers[i] + numbers[j]);
            }
        }
        Object[] arr = h.toArray();
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)arr[i];
        }
        return answer;
    }
}
