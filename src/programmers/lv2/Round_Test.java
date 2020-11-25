package programmers.lv2;

public class Round_Test {
    //예상 대진표
    //1,2 3,4와 같이 왼쪽이 홀수 오른쪽이 짝수인 경우만 구해야한다는 사실을 깨닫고 해결
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int left = 0;
        int right = 0;
        if(a > b) {
            right = a;
            left = b;
        }else {
            right = b;
            left = a;
        }
        while (true) {
            if(right % 2 == 0 && right - left == 1) {
                break;
            }
            right = (right+1)/2;
            left = (left+1)/2;
            answer++;
        }
        return answer;
    }

    //이렇게 비트연산자를 이용해 해결하는 방법을 봤다.
    //이진수를 ^로 XOR 연산을 하고 그 길이를 반환하는 방법을 사용한 것 같은데
    //한번에 이해하기는 힘들어도 이런 생각으로 문제를 풀 수 있다는것 자체가 대단한것 같다.
    public int anotherSolution(int n, int a, int b)
    {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}
