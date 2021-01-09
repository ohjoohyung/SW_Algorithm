package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test_1874 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        List<Character> list = new ArrayList<>();
        int num = 1;

        int index = 0;
        String answer = "";
        while (index<n) {
            if(st.isEmpty()) {
                st.push(num++);
                list.add('+');
            }else {
                if(arr[index] == st.peek()) {
                    st.pop();
                    list.add('-');
                    index++;
                }else {
                    if(num > n) {
                        answer = "NO";
                        break;
                    }else {
                        st.push(num++);
                        list.add('+');
                    }

                }
            }

        }
        if(!st.isEmpty()) {
            System.out.println(answer);
        }else {
            for(Character c : list) {
                System.out.println(c);
            }
        }
    }
}



