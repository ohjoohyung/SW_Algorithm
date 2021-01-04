package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test_10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bigInteger1 = new BigInteger(st.nextToken());
        BigInteger bigInteger2 = new BigInteger(st.nextToken());
        System.out.println(bigInteger1.add(bigInteger2));

    }

    //다른 분이 푼 방법
    //수를 쪼개어 각 자리 수로 이루어진 배열로 만들고 이를 일일이 더하면서 수를 구하는 방법
    //아마 출제자의 의도는 이런 방식으로 문제를 푸는 것이라고 생각한다.
    //다만 자바에도 큰 수를 다루는 BigInteger가 있기에 난 BigInteger를 사용해서 풀었다.
//    public static void main(String[] args) throws IOException, NullPointerException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String[] spl = br.readLine().split(" ");
//
//        int[] A = charToInt(spl[0].toCharArray());
//        int[] B = charToInt(spl[1].toCharArray());
//        int[] C = new int[10001];
//        int resultSize = 0;
//        if (spl[0].length() > spl[1].length())
//            resultSize = spl[0].length()+1;
//        else
//            resultSize = spl[1].length()+1;
//        for (int i = 10000; i > 0; i--) {
//
//
//            C[i]+=A[i]+B[i];
//            if(C[i]>=10) C[i-1]++;
//            C[i]%=10;
//        }
//
//        for (int i = 0; i < resultSize; i++) {
//            if(i==resultSize-1&&C[10000-i]==0)
//                break;
//            sb.append(C[10000 - i]);
//        }
//
//        sb.reverse();
//        System.out.println(sb);
//        br.close();
//    }
//
//    public static int[] charToInt(char[] arr) {
//        int[] temp = new int[10001];
//        for (int i = 0; i < arr.length; i++) {
//            temp[10000 - i] = arr[arr.length - i - 1] - '0';
//        }
//
//        return temp;
//    }
}
