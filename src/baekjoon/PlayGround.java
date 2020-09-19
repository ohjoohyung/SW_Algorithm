package baekjoon;

import java.util.Scanner;

public class PlayGround {
    //16486번 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.println((2 * d1) + (2 * 3.141592 * d2));

    }
}
