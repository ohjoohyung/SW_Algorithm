package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test_2606 {


    static int n;
    static List<List<Integer>> list;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i=0; i<n+1; i++) {
            list.add(new ArrayList<>());
        }
        isVisited = new boolean[n+1];
        for(int i=0; i<m; i++) {
            String[] sArr = br.readLine().split(" ");
            int val1 = Integer.parseInt(sArr[0]);
            int val2 = Integer.parseInt(sArr[1]);

            list.get(val1).add(val2);
            list.get(val2).add(val1);
        }


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        isVisited[1] = true;
        int count = 0;
        while (!stack.isEmpty()) {
            int num = stack.peek();

            List<Integer> tmpList = list.get(num);
            int flag = 0;
            for(int i=0; i<tmpList.size(); i++) {
                int item = tmpList.get(i);
                if(!isVisited[item]) {
                    stack.push(item);
                    flag = -1;
                    isVisited[item] = true;
                    count++;
                    break;
                }
            }
            if(flag == 0) {
                stack.pop();
            }
        }
        System.out.println(count);

    }




}
