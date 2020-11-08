package programmers.lv2;

import java.util.Arrays;

public class Max_Min_Test {
    //최댓값과 최솟값
    //max, min 변수 만들어서 비교하면서 구해도 되지만 그냥 Array.sort 사용했다.
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] ar = new int[arr.length];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(ar);

        String answer = ar[0]+ " " + ar[ar.length-1];
        return answer;
    }
}
