package programmers.lv2;

public class Stock_Test {
    //주식가격 문제
    //time 변수 만들어서 인덱스 값들을 빼면서 넣었는데
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int time = 0;
            for(int j = i+1; j < prices.length; j++) {
                if(j == prices.length) {
                    break;
                }
                if(prices[i] > prices[j]) {
                    time = j - i;
                    break;
                }
                time++;
            }
            answer[i] = time;
        }
        return answer;
    }

    //굳이 그럴 필요없이 이렇게 answer의 배열 값을 +1 하면 된다.
    //그리고 난 바본가... for문 순서를 착각하고 있었네..
    //조건문부터 실행하고 안에 있는 코드가 실행이 되는거다~~~
    public int[] anotherSolution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }
}
