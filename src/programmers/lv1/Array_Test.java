package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class Array_Test {

    //처음엔 String으로 구분자 "," 주면서 숫자 저장시키고 split 이용해서 제거 후
    //String 배열을 int 배열로 바꾸려고 했는데 효율성 검증에서 실패뜸
    //그래서 Arraylist로 저장하고 그걸 배열로 바꾸니까 해결
    public int[] solution(int []arr) {
        List<Integer> numList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                numList.add(arr[0]);
                continue;
            }
            if(arr[i] == arr[i-1]) {
                continue;
            }
            numList.add(arr[i]);
            }
        int[] answer = new int[numList.size()];
        for(int i=0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }

}
