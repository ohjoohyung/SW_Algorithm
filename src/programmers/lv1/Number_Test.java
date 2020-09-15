package programmers.lv1;

public class Number_Test {
    //수 뒤집고 int 배열 만드는 문제
    //10으로 나누면서 숫자를 잘라도 되지만 이번엔 StringBuffer의 reverse를 써서 뒤집어 보았다
    public int[] solution(long n) {
        String s = new StringBuffer(n + "").reverse().toString();
        char[] cArr = s.toCharArray();
        int[] answer = new int[cArr.length];
        for(int i = 0; i < cArr.length; i++) {
            answer[i] = cArr[i] - '0';
        }
        return answer;
    }
}
