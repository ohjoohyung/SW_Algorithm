package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        int GCD = 0;
//        for (int i = a > b ? b : a; i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                GCD = i;
//                break;
//            }
//        }
//        int LCM = a * b / GCD;
//        System.out.println(GCD);
//        System.out.println(LCM);

        //2981번
        //검문
        //공약수를 구하는 문제인데 나머지가 같다는 것에 초점을 맞추어 앞 뒤 값을 뺀 수 끼리 공약수를 구하면 되는 문제
        //생각을 하지 못하였기에 검색해서 해결..
//        int N = Integer.parseInt(br.readLine());
//        int[] numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            numbers[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(numbers);
//
//        int gcdValue = numbers[1] - numbers[0];
//        for (int i = 2; i < N; i++) {
//            gcdValue = getGCDValue(gcdValue, numbers[i] - numbers[i-1]);
//        }
//
//        for (int i = 2; i <= gcdValue; i++) {
//            if (gcdValue % i == 0) {
//                System.out.print(i + " ");
//            }
//        }

        //3036번
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            numbers[i] = Integer.parseInt(st.nextToken());
//        }
//        for (int i = 1; i < N; i++) {
//            int gcdValue = getGCDValue(numbers[0], numbers[i]);
//            System.out.println(numbers[0] / gcdValue + "/" + numbers[i] / gcdValue);
//        }

        //11050번
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int answer = factorial(N) / (factorial(K) * factorial(N - K));
//        System.out.println(answer);

        //11051번
        //파스칼의 삼각형
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int[][] arr = new int[N+1][N+1];
//        for (int i = 0; i <= N; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (i == j || j == 0) {
//                    arr[i][j] = 1;
//                }else {
//                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % 10007;
//                }
//            }
//        }
//        System.out.println(arr[N][K]);


        //9375번
        //프로그래머스 위장이랑 똑같은 문제
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            Map<String, Integer> map = new HashMap<>();
//            for (int j = 0; j < n; j++) {
//                String[] clothes = br.readLine().split(" ");
//                map.put(clothes[1], map.getOrDefault(clothes[1], 0) + 1);
//            }
//            int answer = 1;
//            for (String key : map.keySet()) {
//                answer *= map.get(key) + 1;
//            }
//            System.out.println(answer - 1);
//        }

        //1676번
        //이렇게 풀었는데 굳이 10을 따지지 않고 2와 5만 따져도 똑같은 답이 나온다.
        //그래서 10을 뺀 걸로 수정
//        int n = Integer.parseInt(br.readLine());
//        int answer = 0;
//        int[] count = new int[2];
//        for (int i = n; i >= 1; i--) {
//            int tmpNumber = i;
//            while (true) {
//                if (tmpNumber % 2 == 0) {
//                    count[0]++;
//                    tmpNumber /= 2;
//                }else if (tmpNumber % 5 == 0) {
//                    count[1]++;
//                    tmpNumber /= 5;
//                }
//
//                if (tmpNumber % 2 != 0 && tmpNumber % 5 != 0) {
//                    break;
//                }
//            }
//        }
//        answer += Math.min(count[0], count[1]);
//        System.out.println(answer);


        //2004번
        //2와 5 개수를 카운트 해주기 위해서 그냥 나눠서 나오는 몫만 더하면 됨
        //int로 했다가 범위를 초과해서 전부 long으로 바꿔 해결
        //처음 했던건 시간초과가 떠서 검색 후 해결
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long twoCount = 0;
        long fiveCount = 0;
        twoCount += countTwo(n);
        fiveCount += countFive(n);

        twoCount -= countTwo(m);
        fiveCount -= countFive(m);

        twoCount -= countTwo(n-m);
        fiveCount -= countFive(n-m);

        long answer = Math.min(twoCount, fiveCount);
        System.out.println(answer);
    }

    static long countTwo(long number) {
        long count = 0;
        for (long i = 2; i <= number; i *= 2) {
            count += number / i;
        }
        return count;
    }

    static long countFive(long number) {
        long count = 0;
        for (long i = 5; i <= number; i *= 5) {
            count += number / i;
        }
        return count;
    }


//    static int getGCDValue(int first, int second) {
//        while (second != 0) {
//            int remainder = first % second;
//            first = second;
//            second = remainder;
//        }
//        return first;
//    }
}
