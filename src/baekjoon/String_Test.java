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
//        int n = Integer.parseInt(sc.nextLine());
//        String s = sc.nextLine();
//        int sum = 0;
//        for(int i = 0; i < n; i++) {
//            sum += s.charAt(i)-'0';
//        }
//        System.out.println(sum);
        
        //백준 10809번
//        String s = sc.nextLine();
//        int[] arr = new int[26];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = -1;
//        }
//        for(int i = 0; i < s.length(); i++) {
//            for(int j = 0; j < arr.length; j++) {
//                if(s.charAt(i) -'a' == j && arr[j] == -1) {
//                    arr[j] = i;
//                    break;
//                }
//            }
//        }
//        for(int i : arr) {
//            System.out.print(i+" ");
//        }

        //백준 2675번
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String answer = "";
            String[] sArr = s.split(" ");
            for(int j = 0; j < sArr[1].length(); j++) {
                for(int l = 0; l < Integer.parseInt(sArr[0]); l++) {
                    answer += sArr[1].charAt(j);
                }
            }
            System.out.println(answer);
        }
    }
}
