package programmers.lv1;

public class Collatz_Test {
    //간단했던 문제인데 num을 long 타입으로 바꿔줘야 오류가 뜨지 않는다
    //그 이유는 숫자가 길어지면 int 타입이 전부 담지 못해서 오버플로우가 나기 때문
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1) {
            if(answer == 500) {
                answer = -1;
                break;
            }
            n = n % 2 == 0 ? n / 2 : (n * 3) + 1;
            answer++;
        }
        return answer;
    }
}
