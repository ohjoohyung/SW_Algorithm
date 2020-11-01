package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test_2546 {
    //2546번
    //문제 입력조건을 잘 읽자
    //최악의 경우에 합계가 int 범위를 벗어나서 틀렸다
    //long으로 타입을 수정해주니 해결됨
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());


        for(int i=0; i<T; i++) {
            sc.nextLine();
            String[] values = sc.nextLine().split(" ");
            int N = Integer.parseInt(values[0]);
            int M = Integer.parseInt(values[1]);
            String[] cArr = sc.nextLine().split(" ");

            String[] eArr = sc.nextLine().split(" ");
            long cSum = 0;
            long eSum = 0;
            for(int j=0; j<N; j++) {
                cSum += Integer.parseInt(cArr[j]);
            }
            for(int l=0; l<M; l++) {
                eSum += Integer.parseInt(eArr[l]);
            }
            double cAverage = (double)cSum / N;
            double eAverage = (double)eSum / M;

            int answer = 0;
            for(int k = 0; k < cArr.length; k++) {
                int now = Integer.parseInt(cArr[k]);
                if(now < cAverage) {
                    if(now > eAverage) {
                        answer++;
                    }
                }
            }
            System.out.println(answer);

        }

    }

}

