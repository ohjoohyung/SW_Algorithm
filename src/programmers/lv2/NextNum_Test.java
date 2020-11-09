package programmers.lv2;

public class NextNum_Test {
    //다음 큰 숫자
    //처음에 Integer.toBinaryString 이용해서 풀었는데 시간 초과뜸.
    //이게 사용하기는 간편해도 시간적인 면에서 단순하게 while문 이용해서 이진법 구하는 거보다 오래걸리는가 봄.
    //확실히 메소드를 봐도 다른 메소드 호출하는 등 안에 구현된게 단순히 while문 사용하는거보다 복잡해보임.
    public int solution(int n) {
        int tmp = n;
        int cnt = 0;
        int tmpCnt = 0;
        while (tmp > 0) {
            if(tmp % 2 == 1) {
                cnt++;
            }
            tmp = tmp / 2;
        }

        while (true) {
            tmp = ++n;
            while (tmp > 0) {
                if(tmp % 2 == 1) {
                    tmpCnt++;
                }
                tmp = tmp / 2;
            }
            if(cnt == tmpCnt) {
                break;
            }
            tmpCnt = 0;
        }
        return n;
    }
}
