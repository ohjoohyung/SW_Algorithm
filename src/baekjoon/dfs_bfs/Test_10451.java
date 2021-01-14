package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test_10451 {
    static List<List<Integer>> list;
    static boolean[] isVisited;
    static int count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
            for(int j=0; j<=n; j++) {
                list.add(new ArrayList<>());
            }
            String[] sArr = br.readLine().split(" ");
            isVisited = new boolean[n+1];
            for(int l=1; l<=n; l++) {
                list.get(l).add(Integer.parseInt(sArr[l-1]));
            }
            for(int k=1; k<=n; k++) {
                if(!isVisited[k]) {
                    method(k);
                }


            }
            System.out.println(count);
            count = 0;


        }

    }

    static void method(int num) {
        if(!isVisited[num]) {
            isVisited[num] = true;
        }else {
            count++;
            return;
        }
        List<Integer> tmpList = list.get(num);
        int item = tmpList.get(0);
        method(item);
    }


}
