package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_1654 {
    //범위를 초과하기에 int를 long으로 변경했다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long start = 1;
        long end = arr[k-1];
        long middle = 0;
        long max = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            int temp = 0;
            for (int num : arr) {
                temp += num / middle;
            }
            if (temp >= n) {
                max = Math.max(max, middle);
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        System.out.println(max);
    }
}
