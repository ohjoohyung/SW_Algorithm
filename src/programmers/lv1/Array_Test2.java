package programmers.lv1;

import java.util.Arrays;

public class Array_Test2 {
    //나누어 떨어지는 숫자 배열
    //문자열로 받고 자른 뒤에 다시 배열 만들주고 값을 넣어줬다
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        String num = "";
        for(int n : arr) {
            if(n % divisor == 0) {
                num += n+" ";
            }
        }
        if(num.equals("")) {
            return new int[]{-1};
        }
        String[] numArr = num.split(" ");
        int[] answer = new int[numArr.length];
        for(int i = 0; i < numArr.length; i++) {
            answer[i] = Integer.parseInt(numArr[i]);
        }
        return answer;
    }
}
