package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mathematics {
    static int answer = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        //5073번
//        while(true) {
//            String s = br.readLine();
//            if(s.startsWith("0")) break;
//            String[] arr = s.split(" ");
//            int[] iArr = new int[3];
//            for(int i = 0; i<3; i++) {
//                iArr[i] = Integer.parseInt(arr[i]);
//            }
//            Arrays.sort(iArr);
//            int n1 = iArr[0];
//            int n2 = iArr[1];
//            int n3 = iArr[2];
//            if(n1 == n2 && n2 == n3) {
//                System.out.println("Equilateral");
//                continue;
//            }else if(n3 < n1 + n2) {
//                if(n1 == n2 || n2 == n3 || n3 == n1) {
//                    System.out.println("Isosceles");
//                }else {
//                    System.out.println("Scalene");
//                }
//            }else {
//                System.out.println("Invalid");
//            }
//        }















        //1978번
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int answer = 0;
//        for(int i=0; i<N; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            if(num == 1) continue;
//            if(num == 2) {
//                answer++;
//                continue;
//            }
//            answer++;
//            for(int j=2; j<num; j++) {
//                if(num % j == 0) {
//                    answer--;
//                    break;
//                }
//            }
//        }
//        System.out.println(answer);



        //2581번
//        int M = Integer.parseInt(br.readLine());
//        int N = Integer.parseInt(br.readLine());
//
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        String answer = "";
//        for(int i=M; i<=N; i++) {
//            boolean check = false;
//            if(i==0) check = true;
//            for(int j=2; j*j<=i; j++) {
//                if(i % j == 0) {
//                    check = true;
//                }
//            }
//            if(!check) {
//                sum += i;
//                if(min > i) {
//                    min = i;
//                }
//            }
//        }
//
//        if(sum == 0) {
//            answer = "-1";
//        }else {
//            answer = sum + "\n" + min;
//        }
//
//        System.out.println(answer);


        //1929번
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int M = Integer.parseInt(st.nextToken());
//        int N = Integer.parseInt(st.nextToken());
//        int[] arr = new int[N+1];
//        arr[1] = 1;
//        for(int i=2; i*i<=N; i++) {
//            for(int j=2*i; j <=N; j+=i) {
//                arr[j] = 1;
//            }
//            if(i == 2) {
//                arr[i] = 0;
//            }
//        }
//        for(int i=M; i<=N; i++) {
//            if(arr[i] == 0) {
//                System.out.println(i);
//            }
//        }



        //4948번
//        int n, cnt = 0;
//        int[] arr;
//        while (true) {
//            n = Integer.parseInt(br.readLine());
//            if(n == 0) break;
//            arr = new int[2*n +1];
//            arr[0] = 1;
//            arr[1] = 1;
//            for(int i=2; i*i<=2*n; i++) {
//                for(int j=2*i; j<=2*n; j+=i) {
//                    arr[j] = 1;
//                }
//            }
//
//            for(int i = n; i<=2*n; i++) {
//                if(arr[i] == 0) {
//                    System.out.print(i + " ");
//                    cnt++;
//                }
//                System.out.println();
//            }
//            System.out.println(cnt);
//            cnt = 0;
//
//        }

        //9020번
//        int T = Integer.parseInt(br.readLine());
//        for(int i=0; i<T; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int[] arr = new int[n+1];
//            arr[0] = 1;
//            arr[1] = 1;
//            for(int j=2; j*j<=n; j++) {
//                for(int k=2*j; k<=n; k+=j) {
//                    arr[k] = 1;
//                }
//            }
//
//            for(int j=n/2; j>=0; j--) {
//                if(arr[j] == 0 && arr[n-j] == 0) {
//                    System.out.println(j + " " + (n -j));
//                    break;
//                }
//            }
//        }


        //1085번
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//        int w = Integer.parseInt(st.nextToken());
//        int h = Integer.parseInt(st.nextToken());
//
//        int answer = 0;
//
//        int tmpR = w-x > x-0 ? x-0 : w-x;
//        int tmpC = h-y > y-0 ? y-0 : h-y;
//        answer = tmpR > tmpC ? tmpC : tmpR;
//        System.out.println(answer);

        //3009번
//        int tmpX1 = 0;
//        int tmpY1 = 0;
//        int tmpX2 = 0;
//        int tmpY2 = 0;
//        int cntX = 1;
//        int cntY = 1;
//        for(int i=0; i<3; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//
//            if(i == 0) {
//                tmpX1 = x;
//                tmpY1 = y;
//                continue;
//            }
//
//
//            if(tmpX1 == x) {
//                cntX++;
//            }else {
//                tmpX2 = x;
//            }
//            if(tmpY1 == y){
//                cntY++;
//            }else {
//                tmpY2 = y;
//            }
//
//        }
//        String answer = "";
//        answer += cntX == 2 ? tmpX2 : tmpX1;
//        answer+=" ";
//        answer += cntY == 2 ? tmpY2 : tmpY1;
//        System.out.println(answer);

        //4153번
//        while (true) {
//            String str = br.readLine();
//            if(str.equals("0 0 0")) break;
//            String[] sArr = str.split(" ");
//            int[] arr = new int[3];
//            for(int i=0; i<3; i++) {
//                arr[i] = Integer.parseInt(sArr[i]);
//            }
//            Arrays.sort(arr);
//            String answer = "";
//            if(arr[2] * arr[2] == arr[0]*arr[0] + arr[1]*arr[1]) {
//                answer = "right";
//            }else {
//                answer = "wrong";
//            }
//            System.out.println(answer);
//        }

        //3053번
//        double R = Double.parseDouble(br.readLine());
//        System.out.printf("%.6f\n",Math.PI*R*R);
//        System.out.printf("%.6f",2*R*R);


        //1002번
//        int T = Integer.parseInt(br.readLine());
//        for(int i=0; i<T; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int r1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//            int r2 = Integer.parseInt(st.nextToken());
//
//            int distance_pow = (int)(Math.pow(x1-x2,2) +Math.pow(y1-y2,2));
//            String answer = "";
//            //중점 같으면서 반지름도 같은 경우
//            if(x1 == x2 && y1==y2 && r1==r2) {
//                answer = "-1";
//
//                //두 원의 반지름 합보다 중점 거리가 더 길 때
//            }else if(distance_pow > Math.pow(r1+r2,2)) {
//                answer = "0";
//                //원 안에 있으나 내접하지 않을 때
//            }else if(distance_pow < Math.pow(r1-r2,2)) {
//                answer = "0";
//
//                //내접할 때
//            }else if(distance_pow == Math.pow(r1+r2,2)) {
//                answer = "1";
//
//                //외접할 때
//            }else if(distance_pow == Math.pow(r1-r2,2)) {
//                answer = "1";
//            }else {
//                answer = "2";
//            }
//            System.out.println(answer);
//
//
//        }

        //10757번
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bigInteger1 = new BigInteger(st.nextToken());
        BigInteger bigInteger2 = new BigInteger(st.nextToken());
        System.out.println(bigInteger1.add(bigInteger2));








    }

    private static int method(int k, int n) {
        if(k == 0) {
            return n;
        }

        int tmp = 0;
        for(int i = 1; i <= n; i++) {
            tmp += method(k-1, i);
        }
        return tmp;
    }

    //이런식으로 while문을 이용해 계속 더한다..
    //좋은 방법이라고 생각한다
    private static int solution(int n) {
        // 1: 1 (1)
        // 2 ~ 7 : 2 (6개)
        // 8 ~ 19 : 3 (12개)
        // 20 ~ 37 : 4 (18개)
        // 38 ~ 61 : 5 (24개)
        // ...생략..
        // a(n) = a(n-1) + 6(n-1) | a(n): 첫 항
        if (n == 1) return 1;
        int i = 2;
        int k = 1;

        while (i <= n) {
            i += 6 * k++;
        }

        return k;
    }
}
