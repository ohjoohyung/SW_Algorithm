package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test_9012 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            Stack<Character> stack = new Stack<Character>();
            String s = br.readLine();
            boolean isVPS = true;
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(0) == ')') {
                    isVPS = false;
                    break;
                }
                if(s.charAt(j) == '(') {
                    stack.push('(');
                }else {
                    if(stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }

            }
            if(isVPS && stack.size() == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }

}