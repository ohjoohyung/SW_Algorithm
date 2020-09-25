package programmers.lv2;

import java.util.Arrays;
import java.util.Collections;

public class PhoneNum_Test {
    //전화번호 목록 문제
    //int가 아닌 String 이기에 String 정렬 특성상(사전순 배열) 문자로 인식해 앞에 숫자가 동일하면
    //연속해서 나열된다. 그 후 contains를 이용해 true false를 따졌지만
    //테스트 케이스가 다행히도 전부 접두어로 나와서 통과했을뿐 실제로는 startsWith를 사용해야 맞다
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, Collections.reverseOrder());
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i].contains(phone_book[i+1])) {
                return false;
            }
        }
        return true;
    }
}
