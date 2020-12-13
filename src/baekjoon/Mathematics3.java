package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mathematics3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //5086번
        //        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            if(a == 0 && b == 0) break;
//            String answer = "neither";
//            if(b % a == 0) answer = "factor";
//            if(a % b == 0) answer = "multiple";
//            System.out.println(answer);
//        }

        //1037번
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[0]*arr[N-1]);

        //11653번
        //소인수분해 문제
        //그냥 2부터 시작해서 나누어 떨어지는 수만 출력하면 된다.
        //난 소수를 구하고 그걸 이용해 인수를 판별해 소인수를 구해야한다고 생각해 복잡하게 풀었는데
        //그럴 필요없이 2부터 시작해서 나누기만 하면된다.
        //단, 1일때는 출력을 해줄 필요조차 없다
//        int N = Integer.parseInt(br.readLine());
//        int index = 2;
//        while (N >= index) {
//            if (N % index == 0) {
//                System.out.println(index);
//                N /= index;
//            }else {
//                index++;
//            }
//        }

        //2609번
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int GCD = 0;
        for (int i = a > b ? b : a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
                break;
            }
        }
        int LCM = a * b / GCD;
        System.out.println(GCD);
        System.out.println(LCM);

    }
}
