package programmers.lv1;

import java.util.Arrays;

public class Budget_Test {
    //예산 문제
    //Arrays.sort로 정렬시키고 합쳤다.
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int answer = 0;
        for(int i = 0; i<d.length;i++){
            sum += d[i];
            if(sum<=budget){
                answer++;
            }
        }
        return answer;
    }
}
