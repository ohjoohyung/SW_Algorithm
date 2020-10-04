package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Function.sum(a));
//
//        Scanner sc = new Scanner(System.in);
//        method(sc.nextInt());

        selfNum(10000);



    }
    //15596번
    static long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    //1065번
    static int method(int n) {
        if(n < 100) {
            return n;
        }
        int count = 0;
        for(int i = 100; i <= n; i++) {
            if(i == 1000) continue;
            String[] arr = String.valueOf(i).split("");
            if((Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]))
                    == (Integer.parseInt(arr[1]) - Integer.parseInt(arr[2]))){
                count++;
            }
        }
        return count+99;

    }


    //4673번
    //좀 무식하게 풀었다
    //10으로 나누면서 10으로 나눈 나머지를 더하는걸 왜 떠오르지 못했나..
    static void selfNum(int n) {
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            int num = i;
            while (true) {
                if(arr[i] != 0) break;
                String[] sArr = String.valueOf(num).split("");
                for(String s : sArr) {
                    num += Integer.parseInt(s);
                }
                if(num > n) break;
                arr[num] = num;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
    }

    //이런 방식으로 푸는게 정석인듯
//    public static void main(String[] args) {
//
//        boolean[] check = new boolean[10000];
//
//        for(int j=1;j<=10000;j++) {
//            int n=d(j);
//            if(n<=10000)
//                check[n-1]=true;
//        }
//
//        StringBuilder buf = new StringBuilder();
//        for(int i=0;i<10000;i++) {
//            if(!check[i]) // 생성자가 없으면
//                buf.append(i+1).append("\n");
//        }
//        System.out.println(buf.toString());
//    }
//
//    static int d(int n) {
//        int sum = n;
//        while(n!=0) {
//            sum+=n%10;
//            n/=10;
//        }
//        return sum;
//    }
}
