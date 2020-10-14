package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive {
    //백준 2447번
    //별찍기 문제
    //재귀로 별찍기를 하는건데 풀지 못해서 검색해서 풀었다
    //핵심은 분할 정복,,, 재귀는 증말 어렵다
//    static char[][] arr;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        arr = new char[n][n];
//        makeStar(0,0,n,false);
//
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                sb.append(arr[i][j]);
//            }
//            sb.append('\n');
//        }
//        System.out.println(sb);
//
//    }
//
//    static void makeStar(int x, int y, int n, boolean blank) {
//
//        //공백일 경우
//        if(blank) {
//            for(int i = x; i < x + n; i++) {
//                for(int j = y; j < y + n; j++) {
//                    arr[i][j] = ' ';
//                }
//            }
//            return;
//        }
//
//        //더이상 쪼갤 수 없을 때
//        if(n == 1) {
//            arr[x][y] = '*';
//            return;
//        }
//
//
//        int size = n / 3;
//        int count = 0;
//        for(int i = x; i < x+n; i += size) {
//            for(int j = y; j < y+n; j += size) {
//                count++;
//                if(count == 5) { //공백일때
//                    makeStar(i,j,size,true);
//                }else {
//                    makeStar(i,j,size,false);
//                }
//            }
//        }
//
//    }

    static int count = 0;
    //11729번
    //하노이의 탑
    //재귀함수를 이용한 대표적인 문제
    //n개의 탑을 원하는 위치로 이동시키는 순서
    //n-1개만큼 경유 위치로 이동 -> 마지막 원판을 원하는 위치로 이동 -> 경유지에 있는 n-1개의 원판을 원하는 위치로 이동
    //결국 재귀함수를 두 번 호출해야한다
    //항상 생각하자. 설계가 코딩에 앞선다는 것
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        hanoi(n,1,2,3,sb);
        System.out.println(count);
        System.out.println(sb);

    }


    static void hanoi(int n, int from, int center, int to,StringBuilder sb) {
        if(n == 1) {
            count++;
            sb.append(from + " " + to + "\n");
            return;
        }else {
            hanoi(n-1, from, to, center, sb);
            count++;
            sb.append(from + " " + to + "\n");
            hanoi(n-1, center, from, to, sb);
        }
    }
}
