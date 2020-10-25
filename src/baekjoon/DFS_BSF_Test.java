package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BSF_Test {


        static int n;
        static int[][] arr;
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






            //백준 1260번
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//            int m = sc.nextInt();
//            int v = sc.nextInt();
//            arr = new int[n+1][n+1];
////		list = new ArrayList<List<Integer>>();
////		for(int i=0; i<n+1; i++) {
////			list.add(new ArrayList<Integer>());
////		}
//            isVisited = new boolean[n+1];
//            sc.nextLine();
//            for(int i=0; i<m; i++) {
//                String[] sArr = sc.nextLine().split(" ");
//                int val1 = Integer.parseInt(sArr[0]);
//                int val2 = Integer.parseInt(sArr[1]);
//                arr[val1][val2] = 1;
//                arr[val2][val1] = 1;
//
////			list.get(val1).add(val2);
////			list.get(val2).add(val1);
//            }
//
//
//
//
//            Stack<Integer> stack = new Stack<Integer>();
//            int num;
//            stack.push(v);
//            while(!stack.isEmpty()) {
//                num = stack.peek();
//                if(!isVisited[num]) {
//                    System.out.print(num+" ");
//                    isVisited[num] = true;
//                }
//                int tmp = num;
//                for(int i=1; i<=n; i++) {
//                    if(arr[num][i] == 1) {
//                        if(!isVisited[i]) {
//                            stack.add(i);
//                            tmp = i;
//                            break;
//                        }
//                    }
//                }
//                if(tmp == num) {
//                    stack.pop();
//                }
//            }
//
//
//            for(int i=1; i<n+1; i++) {
//                isVisited[i] = false;
//            }
//
//            System.out.println();
//            Queue<Integer> que = new LinkedList<>();
//            que.add(v);
//            isVisited[v] = true;
//            while(!que.isEmpty()) {
//                num = que.poll();
//                System.out.print(num +" ");
//                for(int i=1; i<=n; i++) {
//                    if(arr[num][i] == 1) {
//                        if(!isVisited[i]) {
//                            que.add(i);
//                            isVisited[i] = true;
//                        }
//                    }
//                }
//            }




        }




}
