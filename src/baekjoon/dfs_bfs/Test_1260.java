package baekjoon.dfs_bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test_1260 {
    static int n;
    static int[][] arr;
    static List<List<Integer>> list;
    static boolean[] isVisitied;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        arr = new int[n+1][n+1];
        isVisitied = new boolean[n+1];
        sc.nextLine();
        for(int i=0; i<m; i++) {
            String[] sArr = sc.nextLine().split(" ");
            int val1 = Integer.parseInt(sArr[0]);
            int val2 = Integer.parseInt(sArr[1]);
            arr[val1][val2] = 1;
            arr[val2][val1] = 1;

        }

        Stack<Integer> stack = new Stack<Integer>();
        int num;
        stack.push(v);
        while(!stack.isEmpty()) {
            num = stack.peek();
            if(!isVisitied[num]) {
                System.out.print(num+" ");
                isVisitied[num] = true;
            }
            int tmp = num;
            for(int i=1; i<=n; i++) {
                if(arr[num][i] == 1) {
                    if(!isVisitied[i]) {
                        stack.add(i);
                        tmp = i;
                        break;
                    }
                }
            }
            if(tmp == num) {
                stack.pop();
            }
        }


        for(int i=1; i<n+1; i++) {
            isVisitied[i] = false;
        }

        System.out.println();
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(v);
        isVisitied[v] = true;
        while(!que.isEmpty()) {
            num = que.poll();
            System.out.print(num +" ");
            for(int i=1; i<=n; i++) {
                if(arr[num][i] == 1) {
                    if(!isVisitied[i]) {
                        que.add(i);
                        isVisitied[i] = true;
                    }
                }
            }
        }




    }

}
