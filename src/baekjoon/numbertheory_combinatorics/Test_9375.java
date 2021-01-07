package baekjoon.numbertheory_combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Test_9375 {
    //프로그래머스 위장이랑 똑같은 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String[] clothes = br.readLine().split(" ");
                map.put(clothes[1], map.getOrDefault(clothes[1], 0) + 1);
            }
            int answer = 1;
            for (String key : map.keySet()) {
                answer *= map.get(key) + 1;
            }
            System.out.println(answer - 1);
        }
    }

}
