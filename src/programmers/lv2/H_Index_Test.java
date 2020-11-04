package programmers.lv2;


import java.util.Arrays;

public class H_Index_Test {
    //H-Index
    //간단한 문제인데 문제를 잘못읽어서 다시 풀었다.
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int H_index = 0;
        int max = 0;
        while (true) {
            int cnt = 0;
            for(int i=0; i<citations.length; i++) {
                if(citations[i] >= H_index) {
                    cnt = citations.length-i;
                    break;
                }
            }

            if(H_index <= cnt) {
                max = H_index;
            }else {
                break;
            }
            H_index++;
        }
        return max;
    }

    //나는 정렬하고 index 0부터 시작해서 풀었는데 그럴 필요없이 끝에서부터 푸는게 더 간단하다.
    public int anotherSolution(int[] citations) {
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }

        return max;
    }
}
