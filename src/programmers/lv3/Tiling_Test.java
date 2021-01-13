package programmers.lv3;

public class Tiling_Test {
    public static void main(String[] args) {
        //https://deveric.tistory.com/61 참고함.
        //결론적으로 피보나치 수열과 같은 식이 나오는데
        //거기까지 접근하는 과정이 잘 나와있음.
        //이런 문제는 점화식을 구하는게 핵심이다..
        int n = 4;
        int a = 1;
        int b = 1;
        for (int i = 0; i < n-1; i++) {
            int c = (a+b) % 1000000007;
            a = b;
            b = c;
        }
        System.out.println(b);

        //조합, 특히 파스칼의 삼각형을 이용해서 풀려고 했다.
        //결과는 답도 틀리고 시간도 초과.
//        int count = n / 2;
//        int[][] arr = new int[n][n];
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (i == j || j == 0) {
//                    arr[i][j] = 1;
//                }else {
//                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % 1000000007;
//                }
//            }
//        }
//        for (int i = 0; i <= count; i++) {
//            if (i == 0 || i == count) {
//                answer++;
//            }else {
//                answer += arr[n-1][i];
//            }
//        }
//        System.out.println(answer);
    }
}
