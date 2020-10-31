package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mathematics {
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        //1712번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String[] sArr = s.split(" ");
//        long n = 0;
//        if((Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) <= 0) {
//            n = -1;
//        }else{
//            n = Long.parseLong(sArr[0]) / (Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) + 1;
//        }
//        System.out.println(n);


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


        //2839번
//        int n = Integer.parseInt(br.readLine());
//        int answer = 3000;
////        if(n % 5 == 0) {
////            answer = n / 5;
////        }else if((n % 5) % 3 == 0) {
////            answer = n / 5 + (n % 5) / 3;
////        }else if(n % 3 == 0) {
////            answer = n / 3;
////        }else {
////            answer = -1;
////        }
//        for(int i = 0; i <= n/3; i++) {
//            for(int j = 0; j <= n/5; j++) {
//                if(3*i + 5*j == n) {
//                    if(i+j < answer) {
//                        answer = i+j;
//                    }
//                }
//            }
//        }
//        if(answer == 3000) answer = -1;
//        System.out.println(answer);


        //2292번
//        int n = Integer.parseInt(br.readLine());
//        int answer=1;
//        while (true) {
//            if(n==1) {
//                answer=0;
//                break;
//            }
//            if(3*(int)Math.pow(answer,2) - 3*answer + 2 <= n &&
//                    3*(int)Math.pow(answer+1,2) - 3*(answer+1) + 2 > n) {
//                break;
//            }
//            answer++;
//        }
//        System.out.println(answer+1);

        //1193번
//        int x = Integer.parseInt(br.readLine());
//        int index = 1;
//        while (true) {
//            if(x==1) {
//                System.out.println("1/1");
//                break;
//            }
//
//            if(index*(index+1)/2 < x && (index+1)*(index+2)/2 >= x) {
//                int val = x - ((index*(index+1)/2)+1);
//                if(index%2 == 0) {
//                    System.out.println((index+1-val)+"/"+(val+1));
//                }else {
//                    System.out.println((val+1)+"/"+(index+1-val));
//                }
//                break;
//            }
//            index++;
//        }

        //2869번
        //Scanner 사용하니까 시간 초과

//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());
//
//        int day = 1;
//        v = v - a;
//        day = v%(a-b) == 0 ? v/(a-b) : v/(a-b) + 1;
//        System.out.println(day+1);


        //10250번
//        int T = Integer.parseInt(br.readLine());
//
//
//        for(int i=0; i<T; i++) {
//            String answer = "";
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int H = Integer.parseInt(st.nextToken());
//            int W = Integer.parseInt(st.nextToken());
//            int N = Integer.parseInt(st.nextToken());
//
//            answer += N % H == 0 ? H : N % H;
//            if(N % H == 0) {
//                answer += N/H > 9 ? N/H : "0"+N/H;
//            }else {
//                answer += (N / H)+1 > 9 ? (N / H)+1 : "0"+((N / H)+1);
//            }
//            System.out.println(answer);
//        }


        //2775번
        //재귀로 풀었다
//        int T = Integer.parseInt(br.readLine());
//        for(int i=0; i<T; i++) {
//            int k = Integer.parseInt(br.readLine());
//            int n = Integer.parseInt(br.readLine());
//            System.out.println(method(k,n));
//
//        }

        //1011번
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            double val = y-x;
            int n = 0;
            int answer = 0;

            n = (int)Math.sqrt(val);

            if(n*n == val) {
                answer = 2*n -1;
            }else if(val <= n*n + n) {
                answer = 2*n;
            }else {
                answer = 2*n+1;
            }


            System.out.println(answer);

        }

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
