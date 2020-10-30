package programmers.lv2;

import java.util.Stack;

public class MakeLargestNum_Test {
    //큰 수 만들기
    //그리디 알고리즘 문제인데 규칙성은 찾아냈으나 예외 경우를 해결하지 못해서 검색해서 참고한 뒤 풀었다
    //쉬운거 같으면서도 어렵다.. 그리디..
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int length = number.length() - k;
        int idx = 0;
        int max = 0;
        for(int i=0; i<length; i++) {
            for(int j = idx; j <= k+i; j++) {
                if(number.charAt(j)-'0' > max) {
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            sb.append(max);
            max = 0;
        }
        return sb.toString();
    }


    //스택을 이용해서 푸는 방법도 있다
    public String anotherSolution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}
