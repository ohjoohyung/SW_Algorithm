package programmers.lv2;

import java.util.Stack;

public class Parenthesis_Test {
    //올바른 괄호
    //스택을 이용해서 풀었지만 다른 풀이를 보니 스택을 풀지 않고 해결했다.
    //생각해보니 스택을 이용하지 않아도 충분히 해결 가능한 문제.
    boolean solution(String s) {
        char[] cArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean check = true;
        for(int i=0; i<cArr.length; i++) {
            if(stack.isEmpty()) {
                if(cArr[i] == '(') {
                    stack.add(cArr[i]);
                }else {
                    check = false;
                    break;
                }
            }else {
                if(cArr[i] == ')') {
                    stack.pop();
                }else {
                    stack.add(cArr[i]);
                }
            }
        }
        if(check && stack.size() == 0) {
            check = true;
        }else {
            check = false;
        }
        return check;
    }


    boolean anotherSolution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
