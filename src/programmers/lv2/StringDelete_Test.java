package programmers.lv2;

import java.util.Stack;

public class StringDelete_Test {
    //짝지어 제거하기
    //스택으로 해결
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(stack.isEmpty()) {
                stack.add(s.charAt(i));
                continue;
            }
            char tmp = stack.peek();
            if(tmp != s.charAt(i)) {
                stack.add(s.charAt(i));
            }else {
                stack.pop();
            }
        }
        int answer = 0;
        answer = stack.isEmpty() ? 1 : 0;
        return answer;

    }
}
