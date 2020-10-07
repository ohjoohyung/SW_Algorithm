package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class String_Test {
    public static void main(String[] args) throws IOException {
        //백준 11654번
        //System.in.read()로 입력하면 아스키코드 값으로 출력이나옴
        Scanner sc = new Scanner(System.in);
//        System.out.println((int)sc.nextLine().charAt(0));
//        System.out.print(System.in.read());


        //백준 11720번
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
