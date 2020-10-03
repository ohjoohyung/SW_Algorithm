package programmers.lv2;

public class Fibonacci_Test {
    //피보나치 문제
    //숫자가 너무 크기때문에 1234567로 나누면서 저장시켜야댄다
    //(A+B)%C == (A%C + B%C)%C와 같다
    //재귀로 풀려니까 stackoverflow 발생
    public int solution(int n) {
        int answer = 0;
        int val1 = 0;
        int val2 = 1;
        int num = 1234567;
        for(int i = 1; i <= n; i++) {
            if(i == n && n >= 2) {
                answer = val2 % num;
                break;
            }else if(n == 1) {
                answer = 1;
            }
            int tmp = val1;
            val1 = val2 % num;
            val2 = tmp + val2 % num;
        }
        return answer;


    }

//    static int fibonacci(long val1, long val2, int now, int n) {
//        if(n >= 2 && now == n) {
//            return (int)(val2 % 1234567);
//        }else if(n == 1) {
//            return (int)val2;
//        }else {
//            return fibonacci(val2, val1+val2, now+1, n);
//        }
//
//    }
}
