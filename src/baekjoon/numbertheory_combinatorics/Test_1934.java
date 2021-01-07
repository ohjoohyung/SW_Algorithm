package baekjoon.numbertheory_combinatorics;

import java.util.Scanner;

public class Test_1934 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            System.out.println((a*b) / Test_1934.method(a, b));

        }

//        Scanner sc = new Scanner(System.in);
//
//        int count = sc.nextInt();
//
//        for(int i = 0; i < count; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            int small = a <= b ? a : b;
//
//            int max = 0;
//            for(int j = small; j >= 1; j--) {
//                if(a % j == 0 && b % j == 0) {
//                    max = j;
//                    break;
//
//                }
//            }
//
//            System.out.println((a*b)/max);
//        }
    }
    static int method(int a, int b) {
        return b == 0 ? a : method(b, a % b);
    }
}