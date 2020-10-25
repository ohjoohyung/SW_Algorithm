package baekjoon;


import java.util.Scanner;

public class BackTracking {
    //15649번
    static int n;
    static int m;
    static boolean[] check;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        check = new boolean[n+1];
        arr = new int[n+1];

        backTracking(0);


    }

    static void backTracking(int cnt) {
        if(cnt == m) {
            for(int i=0; i<cnt; i++) {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=n ;i++) {
            if(check[i]) continue;
            check[i] = true;
            arr[cnt] = i;
            backTracking(cnt+1);
            check[i] = false;
        }
        }
    }



