package baekjoon;

import java.util.*;

public class DFS_BSF_Test {

    //백준 1260번
        static int n;
        static int[][] arr;
        static List<List<Integer>> list;
        static boolean[] isVisited;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int m = sc.nextInt();
            int v = sc.nextInt();
            arr = new int[n+1][n+1];
//		list = new ArrayList<List<Integer>>();
//		for(int i=0; i<n+1; i++) {
//			list.add(new ArrayList<Integer>());
//		}
            isVisited = new boolean[n+1];
            sc.nextLine();
            for(int i=0; i<m; i++) {
                String[] sArr = sc.nextLine().split(" ");
                int val1 = Integer.parseInt(sArr[0]);
                int val2 = Integer.parseInt(sArr[1]);
                arr[val1][val2] = 1;
                arr[val2][val1] = 1;

//			list.get(val1).add(val2);
//			list.get(val2).add(val1);
            }




            Stack<Integer> stack = new Stack<Integer>();
            int num;
            stack.push(v);
            while(!stack.isEmpty()) {
                num = stack.peek();
                if(!isVisited[num]) {
                    System.out.print(num+" ");
                    isVisited[num] = true;
                }
                int tmp = num;
                for(int i=1; i<=n; i++) {
                    if(arr[num][i] == 1) {
                        if(!isVisited[i]) {
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
                isVisited[i] = false;
            }

            System.out.println();
            Queue<Integer> que = new LinkedList<>();
            que.add(v);
            isVisited[v] = true;
            while(!que.isEmpty()) {
                num = que.poll();
                System.out.print(num +" ");
                for(int i=1; i<=n; i++) {
                    if(arr[num][i] == 1) {
                        if(!isVisited[i]) {
                            que.add(i);
                            isVisited[i] = true;
                        }
                    }
                }
            }




        }

}
