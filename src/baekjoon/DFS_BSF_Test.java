package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BSF_Test {
    static int n;
    static int[][] arr;
    static List<List<Integer>> list;
    static boolean[][] isVisited;
    static int count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //3098번
        //애초에 dfs bfs 문제가 아닌데 괜히 그쪽으로 접근하다 어려웠던것 같다
        //구글 검색 후 문제를 해결하였다
        //핵심은 행렬을 잘 사용해야 한다는 것. (1,2) (2,3)이 친구일때 (1,3)이 친구가 된다는 것
        //그리고 i > l이라는 조건을 사용해 행렬을 기준으로 오른쪽 위의 값만 따진다는것
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int val = 1;
        arr = new int[n+1][n+1];
        int total = 0;
        int before = 0;
        for(int i = 0; i<m; i++) {
            String[] items = br.readLine().split(" ");
            int a = Integer.parseInt(items[0]);
            int b = Integer.parseInt(items[1]);
            arr[a][b] = val;
            arr[b][a] = val;
            total++;
        }

        int answer = 0;
        List<Integer> totalList = new ArrayList<>();

        while (true) {
            before = total;
            val++;
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                  if(arr[i][j] > 0 && arr[i][j] < val) {
                      for(int l = 1; l<=n; l++) {
                          if(arr[j][l] > 0 && arr[j][l] < val && i < l) {
                              if(arr[i][l] == 0) {
                                  arr[i][l] = val;
                                  arr[l][i] = val;
                                  total++;
                              }
                          }
                      }
                  }
                }
            }
            answer = total - before;
            totalList.add(answer);

            if (total == (n*(n-1))/2) {
                break;
            }

        }
        System.out.println(totalList.size());
        for(Integer i : totalList) {
            System.out.println(i);
        }



        //10451번
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            list = new ArrayList<>();
//            for(int j=0; j<=n; j++) {
//                list.add(new ArrayList<>());
//            }
//            String[] sArr = br.readLine().split(" ");
//            isVisited = new boolean[n+1];
//            for(int l=1; l<=n; l++) {
//                list.get(l).add(Integer.parseInt(sArr[l-1]));
//            }
//            for(int k=1; k<=n; k++) {
//                    if(!isVisited[k]) {
//                            method(k);
//                    }
//
//
//            }
//                System.out.println(count);
//            count = 0;
//
//
//        }



        //2606번
//            n = Integer.parseInt(br.readLine());
//            int m = Integer.parseInt(br.readLine());
//            list = new ArrayList<>();
//            for(int i=0; i<n+1; i++) {
//                list.add(new ArrayList<>());
//            }
//            isVisited = new boolean[n+1];
//            for(int i=0; i<m; i++) {
//                String[] sArr = br.readLine().split(" ");
//                int val1 = Integer.parseInt(sArr[0]);
//                int val2 = Integer.parseInt(sArr[1]);
//
//                list.get(val1).add(val2);
//                list.get(val2).add(val1);
//            }
//
//
//            Stack<Integer> stack = new Stack<>();
//            stack.push(1);
//            isVisited[1] = true;
//            int count = 0;
//            while (!stack.isEmpty()) {
//                int num = stack.peek();
//
//                List<Integer> tmpList = list.get(num);
//                int flag = 0;
//                for(int i=0; i<tmpList.size(); i++) {
//                    int item = tmpList.get(i);
//                    if(!isVisited[item]) {
//                        stack.push(item);
//                        flag = -1;
//                        isVisited[item] = true;
//                        count++;
//                        break;
//                    }
//                }
//                if(flag == 0) {
//                    stack.pop();
//                }
//            }
//            System.out.println(count);


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

//    static void method(int num) {
//            if(!isVisited[num]) {
//                    isVisited[num] = true;
//            }else {
//                    count++;
//                    return;
//            }
//            List<Integer> tmpList = list.get(num);
//            int item = tmpList.get(0);
//            method(item);
//    }


}
