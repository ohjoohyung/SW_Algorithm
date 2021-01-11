package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_13305 {
    public static void main(String[] args) throws IOException {
        //나름 아이디어도 잘 떠올라서 쉽게 풀 수 있겠다고 생각했는데 틀렸다고 떴다.
        //나는 먼저 현재 가격보다 낮은 가격이 나오기 전까지 반복문을 통해 인덱스를 하나씩 더해주고 그 차이만큼 for 문을 돌려
        //답을 구했는데 어딘가 잘못된 곳이 있는거 같다. 발견하지는 못했다...
        //검색해서 풀이를 보니 초기값을 구해주고 현재 인덱스와 다음 인덱스를 먼저 나누고 비교한 뒤 더했더라.
        //이게 훨씬 더 깔끔한 풀이인 거 같아서 참고하여 해결했다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] lengths = new long[n-1];
        long[] prices = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }


        long answer = prices[0] * lengths[0];
        int nowIndex = 0;
        int nextIndex = nowIndex + 1;
        while (nextIndex < n - 1) {
            if (prices[nowIndex] < prices[nextIndex]) {
                answer += prices[nowIndex] * lengths[nextIndex];
            }else {
                answer += prices[nextIndex] * lengths[nextIndex];
                nowIndex = nextIndex;
            }
            nextIndex++;
        }
        System.out.println(answer);

//        while (true) {
//            int tmpIndex = cityIndex;
//            while (true) {
//                if (cityIndex == n-1) {
//                    break;
//                }
//                cityIndex++;
//                if (prices[cityIndex-1] > prices[cityIndex]) {
//                    break;
//                }
//            }
//            for (int i = tmpIndex; i < cityIndex; i++) {
//                answer += prices[tmpIndex] * lengths[i];
//            }
//            if (cityIndex == n-1) {
//                break;
//            }
//        }
    }
}
