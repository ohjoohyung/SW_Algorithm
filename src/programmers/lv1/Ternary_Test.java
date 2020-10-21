package programmers.lv1;

public class Ternary_Test {
    //3진법 뒤집기
    public int solution(int n) {
        String s = "";
        while (n != 0) {
            s = n%3 + s;
            n = n/3;
        }
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            answer += (s.charAt(i)-'0') * (int)Math.pow(3, i);
        }
        return answer;
    }
}
