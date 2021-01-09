package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test_10828 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> st = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            switch (s) {
                case "top":
                    try {
                        System.out.println(st.peek());
                    } catch (Exception e) {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "empty":
                    if (st.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "pop":
                    try {
                        System.out.println(st.pop());
                    } catch (Exception e) {
                        System.out.println(-1);
                    }
                    break;
                default:
                    String[] sArr = s.split(" ");
                    st.push(Integer.parseInt(sArr[1]));
                    break;
            }
        }
    }
}



