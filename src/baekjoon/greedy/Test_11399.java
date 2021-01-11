package baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Test_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = 0;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            min += sum;
        }
        System.out.println(min);
    }

}
