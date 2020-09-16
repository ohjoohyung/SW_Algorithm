package programmers.lv1;

public class Root_Test {
    //생각보다 쉬운 문제
    //제곱근 구하고 제곱할때 Math에 있는 메소드를 써도 되지만 일단 그냥 풀어보았다.
    public long solution(long n) {
        long answer = 0;
        for(long i = 1; i <= n; i++) {
            if(n / i == i && n % i == 0) {
                answer = (i + 1) * (i + 1);
                break;
            }
        }
        if(answer == 0) {
            answer = -1;
        }
        return answer;
    }

    //Math를 사용할 경우 이렇게 하면 될듯 싶다
    //Math.sqrt는 제곱근을 구하는거고 double 타입으로 return 하므로 int로 형변환 시켰다.
    //Math.pow는 제곱을 하는 메소드
    public long anotherSolution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
}
