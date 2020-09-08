package programmers.lv1;

public class String_Test {

    //해놓고 보니까 굳이 String을 char 배열로 바꿀 이유가 없네
    //비교적 간단한 문제였다
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] cArr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for (char c : cArr) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        if (pCount != yCount) {
            answer = false;
        }
        return answer;
    }
}

