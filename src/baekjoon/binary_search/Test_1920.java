package baekjoon.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_1920 {
    //수 찾기
    //이분탐색 문제
    //https://satisfactoryplace.tistory.com/39 이분탐색 개념을 몰라 요 블로그를 참고했다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int tempNumber = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = n - 1;
            int mid = (start+end)/2;
            boolean isAdd = false;
            while (end - start >= 0) {
                if (arr[mid] == tempNumber) {
                    sb.append(1+"\n");
                    isAdd = true;
                    break;
                }else if (arr[mid] > tempNumber) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
                mid = (start+end)/2;
            }
            if (!isAdd) {
                sb.append(0+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
