package baekjoon;

import java.util.Scanner;

public class LCM {
    public static void main(String_Test[] args) {
        
        //1934번 문제
        //1번째 방법
        //곱한값에 최대공약수 나누기
        //자신이 생각한 것을 코드로 짤 수 있어야한다
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int small = a <= b ? a : b;

            int max = 0;
            for (int j = small; j >= 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    max = j;
                    break;

                }
            }
            System.out.println((a * b) / max);
        }



        //2번째 방법
        //유클리드호제법 사용
        sc = new Scanner(System.in);

        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            System.out.println((a * b) / LCM.method(a, b));


        }
    }

    static int method ( int a, int b){
        return b == 0 ? a : method(b, a % b);
    }
}