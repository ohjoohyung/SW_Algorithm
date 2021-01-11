package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test_1931 {
    public static void main(String[] args) {
        //핵심은 endTime이 낮은 순서로 정렬하는 것
        //내 생각이지만 아마 String 배열로 만들었다가 메모리 초과가 뜬거같다
        //그래서 검색 후 이차원배열로 만듬

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] next) {
                if(first[1] == next[1]) {
                    return Integer.compare(first[0], next[0]);
                }
                return Integer.compare(first[1], next[1]);
            }
        });

        int max = 1;
        int endTime = arr[0][1];
        for(int i = 1; i < n; i++) {
            int startTime = arr[i][0];
            if(startTime >= endTime) {
                endTime = arr[i][1];
                max++;
            }
        }
        System.out.println(max);


//        for(int i = 0; i < n; i++) {
//        //버블 정렬
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
//        }
    }
}
