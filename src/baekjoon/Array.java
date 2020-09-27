package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //백준 10818번 문제
        //최댓값, 최솟값 출력 문제
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        int[] arr = new int[count];
//        int max = 0, min = 0;
//        for(int i = 0; i < count; i++) {
//            arr[i] = sc.nextInt();
//            if(i == 0) {
//                max = arr[i];
//                min = arr[i];
//                continue;
//            }
//            if(max < arr[i]) {
//                max = arr[i];
//            }
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//
//
//        }
//        System.out.println(min + " " + max);


        //백준 2562번 문제
        //배열 사용안해도 될듯
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[9];
//        int index = 0;
//        int max = 0;
//        for(int i = 0; i < 9; i++) {
//            arr[i] = sc.nextInt();
//            if(max <= arr[i]) {
//                max = arr[i];
//                index = i+1;
//            }
//        }
//        System.out.println(max + " / " + index);

//        int n = 0;
//        int index = 0;
//        int max = 0;
//        for(int i = 1; i <= 9; i++) {
//            n = sc.nextInt();
//            if(max <= n) {
//                max = n;
//                index = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);

        //백준 2577번 문제
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int n = a*b*c;
//        String[] arr = String.valueOf(n).split("");
//        for(int i = 0; i <= 9; i++) {
//            int count = 0;
//            for(String s : arr) {
//                if(i == Integer.parseInt(s)) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }


        //백준 3052번 문제
        //나머지로 이루어진 배열을 만들면서 같은 숫자가 들어오면 -1을 넣었다.
        //그 후 개수 셀 때 -1을 제외한 나머지로 개수를 세도록 만들었다
//        int[] arr = new int[10];
//        for(int i = 0; i < 10; i++) {
//            int n = sc.nextInt();
//            arr[i] = n % 42;
//            if(i != 0) {
//                for(int j = 0; j < i; j++) {
//                    if(arr[i] == arr[j]) {
//                        arr[i] = -1;
//                        break;
//                    }
//                }
//            }
//        }
//        int count = 0;
//        for(int i : arr) {
//            if(i != -1) {
//                count++;
//            }
//        }
//        System.out.println(count);


        //백준 1546번 문제
//        int n = sc.nextInt();
//        float[] arr = new float[n];
//        float max = 0;
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            if(max <= arr[i]) {
//                max = arr[i];
//            }
//        }
//        float sum = 0;
//        for(int i = 0; i < n; i++) {
//            arr[i] = (arr[i] / max) * 100;
//            sum += arr[i];
//
//        }
//
//        System.out.println(sum / n);


        //백준 8958번 문제
        //X로 나누고 등차수열 합으로 풀었다. 다만 문자열 배열에 공백이 포함이 되어있어 필요없는 부분까지
        //for문을 돌기에 시간을 잡아먹는것 같다
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < n; i++) {
//            int score = 0;
//            String str = sc.nextLine();
//            String[] arr = str.split("X");
//            for(int j = 0; j < arr.length; j++) {
//                if(!arr[j].equals("")) {
//                    score += arr[j].length()*(arr[j].length()+1) / 2;
//                }
//            }
//            System.out.println(score);
//        }

        //백준 4344번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++) {
                String s = br.readLine();
                String[] arr = s.split(" ");
                int sum = 0;
                for(int j = 1; j < arr.length; j++) {
                    sum += Integer.parseInt(arr[j]);
                }
                int average = sum / Integer.parseInt(arr[0]);
                float count = 0;
                for(int j = 1; j < arr.length; j++) {
                    if(average < Integer.parseInt(arr[j])) {
                        count++;
                    }
                }
                System.out.println(String.format("%.3f",(count / Integer.parseInt(arr[0]))*100)+"%");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
 