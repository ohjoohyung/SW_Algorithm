package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test_4949 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Character> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if(s.equals(".")) break;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == ')') {
                    if(st.isEmpty()) {
                        st.push(s.charAt(i));
                    }else if(!st.isEmpty() && st.peek() == '[') {
                        st.push(s.charAt(i));
                    }
                }else if(s.charAt(i) == ']') {
                    if (st.isEmpty()) {
                        st.push(s.charAt(i));
                    } else if (!st.isEmpty() && st.peek() == '(') {
                        st.push(s.charAt(i));
                    }
                }

                if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                }else if(!st.isEmpty()) {
                    if(st.peek() == '(' && s.charAt(i) ==')') {
                        st.pop();
                    }else if(st.peek() == '[' && s.charAt(i) ==']') {
                        st.pop();
                    }
                }
            }
            if(st.isEmpty()) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            st.clear();

        }
    }
}



