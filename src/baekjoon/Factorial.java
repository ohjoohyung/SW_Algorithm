package baekjoon;

import java.util.Scanner;

public class Factorial {

    //재귀함수 문제
    //0! == 1
    public static int factorial(int number) {
        if(number == 1 || number == 0) {
            return 1;
        }
       return number * factorial(number-1);
    }

    public static void main(String_Test[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
}
