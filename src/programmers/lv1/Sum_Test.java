package programmers.lv1;

public class Sum_Test {

    //자릿수 합을 구하는 문제
    //이거 같은 경우 10으로 나눈 나머지를 더하는 식으로 문제를 풀어도 되지만
    //전에 다른 문제를 그런식으로 풀었기에 이번에는 문자열로 바꾸고 그걸 문자로 바꾼 뒤
    //'0'을 빼서 int로 변환시킨 값을 더하는 식으로 문제를 풀었다
    //But, 효율성 제로.. 리소스 너무 먹는다.. 이 문제는 그냥 10으로 나누면서 푸는게 낫겠다..
    public int solution(int n) {
        int answer = 0;
        String a = n + "";
        char[] cArr = a.toCharArray();
        for (char c : cArr) {
            answer += c - '0';
        }
        return answer;
    }

    //이런 방식으로!!
    public int anotherSolution(int n) {
        int answer = 0;
        while (true) {
            answer += n % 10;
            if (n < 10)
                break;
            n = n / 10;
        }
        return answer;
    }
}
