package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    static int cnt = 0;
    public static void main(String[] args) {
//       String s = "110010101001";
//       int totalCnt = 0, len, zeroCnt, num = 1;
//       String tmpS = "";
//       int[] answer = new int[2];
//
//        while (true) {
//            tmpS = s.replace("0", "");
//            len = tmpS.length();
//            zeroCnt = s.length() - len;
//            totalCnt += zeroCnt;
//            s = Integer.toBinaryString(len);
//            if(s.equals("1")) break;
//            num++;
//
//        }
//        answer[0] = num;
//        answer[1] = totalCnt;
//        System.out.println(num+"/"+totalCnt);

//        int[] a = {0,3,3,0,7,2,0,2,2,0};
//        int n = a.length;
//        boolean[] visited = new boolean[n];
//
//        for(int i=4; i <= n; i +=2) {
//            combination(a, visited, 0, n, i);
//        }
//
//
//
//    }
//    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
//        if(r == 0) {
//            print(arr,visited,n);
//            return;
//        }else {
//            for(int i = start; i < n; i++) {
//                visited[i] = true;
//                combination(arr, visited, i+1, n, r-1);
//                visited[i] = false;
//            }
//        }
//    }
//
//    static void print(int[] arr, boolean[] visited, int n) {
//        for(int i=0; i<n; i++) {
//            if(visited[i]) {
//                System.out.print(arr[i] +" ");
//            }
//        }
//        System.out.println();
//    }


//        int t[][] = {{5,1},{2,5},{3,5},{3,6},{2,4},{4,0}};
//        //int t[][] = {{2,5},{2,0},{3,2},{4,2},{2,1}};
//        int[] visited = new int[t.length+1];
//
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0; i<t.length+1; i++) {
//            list.add(new ArrayList<>());
//        }
//        for(int i=0; i<t.length; i++) {
//            list.get(t[i][0]).add(t[i][1]);
//            list.get(t[i][1]).add(t[i][0]);
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//        int[] tmpArr;
//
//        while (!stack.isEmpty()) {
//            int tmp = stack.peek();
//            if(visited[tmp] == 0) {
//                cnt++;
//            }else if(visited[tmp] >= 2) {
//                break;
//            }
//            visited[tmp]++;
//            List<Integer> tmpList = list.get(tmp);
//            for(int i=0; i<tmpList.size(); i++) {
//                int item = tmpList.get(i);
//                if(item >= 1) {
//                    tmpList.remove(item);
//                    tmpList.add(item);
//                }
//            }
//
//            int flag = 0;
//
//            for(int i=0; i<tmpList.size(); i++) {
//                int item = tmpList.get(i);
//                if(visited[item] == 1) {
//                    if(i < tmpList.size()-1) {
//                        int next = tmpList.get(i+1);
//                        if(visited[next] == 0) continue;
//                    }
//                }
//
//                if(visited[item] == 0 || visited[item] == 1) {
//                    System.out.println(item + "/" + cnt);
//                    flag++;
//                    stack.push(item);
//                    break;
//                }
//            }
//            if(flag == 0) stack.pop();
//        }
//
//        System.out.println(cnt);







    }


}