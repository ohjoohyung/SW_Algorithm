package programmers.lv1;

import javax.sound.midi.Soundbank;

public class Desc_Test {
    //버블정렬로 내림차순 정렬해보았음
    //Arrays.sort하고 reverse해도 될듯
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        String tmp = "";
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(Integer.parseInt(arr[j - 1]) < Integer.parseInt(arr[j])) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(String s : arr) {
            answer += s;
        }
        return Long.parseLong(answer);
    }
}
