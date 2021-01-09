package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test_10773 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> st = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val > 0) {
                st.push(val);
            }else {
                st.pop();
            }
        }
        int sum = 0;
        int len = st.size();
        for(int i = 0; i < len; i++) {
            sum+=st.pop();
        }
        System.out.println(sum);
    }
}



