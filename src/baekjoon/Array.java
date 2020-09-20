package baekjoon;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //백준 10818번 문제
        //최댓값, 최솟값 출력 문제
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        int[] arr = new int[count];
//        int max = 0, min = 0;
//        for(int i = 0; i < count; i++) {
//            arr[i] = sc.nextInt();
//            if(i == 0) {
//                max = arr[i];
//                min = arr[i];
//                continue;
//            }
//            if(max < arr[i]) {
//                max = arr[i];
//            }
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//
//
//        }
//        System.out.println(min + " " + max);


        //백준 2562번 문제
        //배열 사용안해도 될듯
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        int index = 0;
//        int max = 0;
//        for(int i = 0; i < 9; i++) {
//            arr[i] = sc.nextInt();
//            if(max <= arr[i]) {
//                max = arr[i];
//                index = i+1;
//            }
//        }
//        System.out.println(max + " / " + index);

//        int n = 0;
//        int index = 0;
//        int max = 0;
//        for(int i = 1; i <= 9; i++) {
//            n = sc.nextInt();
//            if(max <= n) {
//                max = n;
//                index = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);

        //백준 2577번 문제
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a*b*c;
        String[] arr = String.valueOf(n).split("");
        for(int i = 0; i <= 9; i++) {
            int count = 0;
            for(String s : arr) {
                if(i == Integer.parseInt(s)) {
                    count++;
                }
            }
            System.out.println(count);
        }

     
    }
}
 