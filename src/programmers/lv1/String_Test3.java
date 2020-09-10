package programmers.lv1;

import java.util.Arrays;

public class String_Test3 {
    //문자열을 char 배열로 바꾸고 내림차순 정렬을 위해 버블정렬을 사용했다
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        char temp;
        for(int i = 0; i < cArr.length - 1; i++) {
            for(int j = i + 1; j < cArr.length; j++) {
                if(cArr[i] < cArr[j]) {
                    temp = cArr[i];
                    cArr[i] = cArr[j];
                    cArr[j] = temp;
                }
            }
        }
        answer = String.valueOf(cArr);
        return answer;
    }

    //최대한 Arrays.sort를 안쓰려고 한건데 다들 쓰더라.. 요런식으로
    //reverse() 라는거도 있더라
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
