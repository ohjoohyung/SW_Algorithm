package baekjoon;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String_Test[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(0, 1, 1, n);

    }
    //num++를 썼었는데 생각해보니 그건 method가 실행되고 +1을 하는거라 디버깅해보니 실제로 파라미터 값으로 안들어가더라
    public static void method(int val1, int val2, int now, int n) {
        if(now == n) {
            System.out.println(val2);
            return;
        }else if(n == 0) {
            System.out.println(0);
            return;
        }else {
            method(val2, val1+val2, now+1, n);
        }
    }
}
