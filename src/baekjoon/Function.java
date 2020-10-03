package baekjoon;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Function.sum(a));

        Scanner sc = new Scanner(System.in);
        method(sc.nextInt());

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
}
