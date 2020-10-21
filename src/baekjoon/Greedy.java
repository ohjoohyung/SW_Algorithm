package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy {
    public static void main(String[] args) throws IOException {

        //11047번
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String[] s = br.readLine().split(" "); //입력받고 공백으로 나누기
//
//        //StringTokenizer를 사용해보았다
//        StringTokenizer st = new StringTokenizer(br.readLine());
////        int n = Integer.parseInt(s[0]); //n개 동전
////        int k = Integer.parseInt(s[1]); //k원
//        int n = Integer.parseInt(st.nextToken()); //n개 동전
//        int k = Integer.parseInt(st.nextToken()); //k원
//        int[] coinArr = new int[n]; //동전들의 배열
//        for(int i = 0; i < n; i++) {
//            coinArr[i] = Integer.parseInt(br.readLine());
//        }
//        int count = 0;
//        for(int i = n-1; i >=0; i--) {
////            if(coinArr[i] > k) {
////                continue;
////            }
////            count += k / coinArr[i];
////            k = k % coinArr[i];
//
//            //왜 굳이 continue를 사용해서 코드를 늘렸을까
//            if(coinArr[i] <= k) {
//                count += k / coinArr[i];
//                k = k % coinArr[i];
//            }
//        }
//        System.out.println(count);

        //1931번
        //핵심은 endTime이 낮은 순서로 정렬하는 것
        //내 생각이지만 아마 String 배열로 만들었다가 메모리 초과가 뜬거같다
        //그래서 검색 후 이차원배열로 만듬
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for(int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] first, int[] next) {
//                if(first[1] == next[1]) {
//                    return Integer.compare(first[0], next[0]);
//                }
//                return Integer.compare(first[1], next[1]);
//            }
//        });
//
//        int max = 1;
//        int endTime = arr[0][1];
//        for(int i = 1; i < n; i++) {
//            int startTime = arr[i][0];
//            if(startTime >= endTime) {
//                endTime = arr[i][1];
//                max++;
//            }
//        }
//        System.out.println(max);


        //for(int i = 0; i < n; i++) {
        //버블 정렬
//            for(int j = 1; j < n-i; j++) {
//                int firstStartTime = Integer.parseInt(sArr[j-1].split(" ")[0]);
//                int nextStartTime = Integer.parseInt(sArr[j].split(" ")[0]);
//                int firstEndTime = Integer.parseInt(sArr[j-1].split(" ")[1]);
//                int nextEndTime = Integer.parseInt(sArr[j].split(" ")[1]);
//                if(firstEndTime > nextEndTime){
//                    tmp = sArr[j-1];
//                    sArr[j-1] = sArr[j];
//                    sArr[j] = tmp;
//                }else if(firstEndTime == nextEndTime) {
//                    if(firstStartTime
//                    > nextStartTime) {
//                        tmp = sArr[j-1];
//                        sArr[j-1] = sArr[j];
//                        sArr[j] = tmp;
//                    }
//                }
//            }
        //}

        //11399번
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int min = 0;
//        int sum = 0;
//        for(int i=0; i<n; i++) {
//            sum += arr[i];
//            min += sum;
//        }
//        System.out.println(min);






    }
}
