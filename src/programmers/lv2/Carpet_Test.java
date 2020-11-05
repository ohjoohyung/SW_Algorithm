package programmers.lv2;

public class Carpet_Test {
    //카펫
    //완전탐색 이지만 그냥 수학문제
    //yellow가 아닌 brown에 초점을 두고 풀면 된다.
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int x = (brown+4) / 2;

        for(int i=x-1; i>=1; i--) {
            if((i-2)*(x-i-2) == yellow) {
                answer[0] = i;
                answer[1] = x-i;
                break;
            }
        }
        return answer;
    }
}
