package baekjoon;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //백준 10818번 문제
        //최댓값, 최솟값 출력 문제
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int max = 0, min = 0;
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            if(i == 0) {
                max = arr[i];
                min = arr[i];
                continue;
            }
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }

           
        }
        System.out.println(min + " " + max);

     
    }
}
 