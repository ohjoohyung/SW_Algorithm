package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test_10816 {
    //이분탐색 문제
    //숫자 카운트는 map으로 해결했다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
            map.put(cards[i], map.getOrDefault(cards[i], 0) + 1);
        }
        Arrays.sort(cards);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int tempNumber = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = n - 1;
            int mid = 0;
            boolean isAdd = false;
            while (start <= end) {
                mid = (start + end) / 2;
                if (tempNumber == cards[mid]) {
                    sb.append(map.get(tempNumber)+" ");
                    isAdd = true;
                    break;
                }else if (tempNumber > cards[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (!isAdd) {
                sb.append(0+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
