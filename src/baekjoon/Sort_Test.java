package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_Test {
    public static void main(String[] args) throws IOException {
        
        //2750번
        //삽입정렬로 품
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int tmp = 0;
        for(int i=1; i<N; i++) {
            for(int j=0; j<i; j++) {
                if(arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(arr[i]);
        }
    }
}
