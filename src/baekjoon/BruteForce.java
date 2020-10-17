package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce {
    public static void main(String[] args) throws IOException {

        //2798번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] sArr1 = br.readLine().split(" ");
//        String[] sArr2 = br.readLine().split(" ");
//        int max = 0;
//        for(int i = 0; i < sArr2.length; i++) {
//            for(int j = i + 1; j < sArr2.length; j++) {
//                for(int l = j + 1; l < sArr2.length; l++) {
//                    int sum = Integer.parseInt(sArr2[i]) + Integer.parseInt(sArr2[j])
//                            + Integer.parseInt(sArr2[l]);
//                    if(sum > max && sum <= Integer.parseInt(sArr1[1])) {
//                        max = sum;
//                    }
//                }
//            }
//        }
//        System.out.println(max);


        //2231번
        //분해합
        //내가 생각했던 풀이는 1부터 시작해서 생성자를 찾아가는 것인데 통과는 한다
        //그러나 메모리랑 시간을 많이 잡아먹는다 (좋지 않은 풀이)
//        int n = Integer.parseInt(br.readLine());
//        int val = 1;
//        while(true) {
//            if(val >= n) {
//                val = 0;
//                break;
//            }
//            int tmp = val;
//            char[] cArr = String.valueOf(val).toCharArray();
//            for(int i = 0; i < cArr.length; i++) {
//                tmp += cArr[i] - '0';
//            }
//            if(n == tmp) {
//                break;
//            }else {
//                val++;
//            }
//        }
//        System.out.println(val);

        //굳이 1부터 시작해서 생성자를 찾아갈 필요가 없다
        //생성자란 입력 숫자보다 최대 자릿수*9 보다 작은값이기에 이 값부터 시작하면 된다
//        String sNum = br.readLine();
//        int len = sNum.length();
//        int num = Integer.parseInt(sNum);
//        int answer = 0;
//        for(int i = num - (len * 9); i < num; i++) {
//            int sum = i, tmp = i;
//            while (tmp > 0) {
//                sum += tmp % 10;
//                tmp /= 10;
//            }
//            if(sum == num) {
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);

        //7568번
        int n = Integer.parseInt(br.readLine());
        String[] sArr = new String[n];
        for(int i = 0; i < n; i++) {
            sArr[i] = br.readLine();
        }

        for(int i = 0; i < n; i++) {
            String[] s1 = sArr[i].split(" ");
            int weight1 = Integer.parseInt(s1[0]);
            int height1 = Integer.parseInt(s1[1]);
            int rank = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                String[] s2 = sArr[j].split(" ");
                int weight2 = Integer.parseInt(s2[0]);
                int height2 = Integer.parseInt(s2[1]);
                if(weight1 < weight2 && height1 < height2) {
                    rank++;
                }
            }
            System.out.print((rank+1)+" ");

        }

    }
}
