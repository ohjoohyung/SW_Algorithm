package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNum_Test {
    //가장 큰 수
    //String 배열로 바꾸고 Arrays.sort로 정렬시키는거까지는 아이디어가 떠올랐지만
    //그 후에 숫자를 다시 어떻게 정렬시킬지 도저히 떠오르지 않아서 참고를 하고 풀었다
    //핵심은 합친 String 값을 비교해야되고 0일때도 따로 구해줘야하는것
    public String solution(int[] numbers) {
        String[] arr2 = new String[numbers.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String answer = "";

        for(String s : arr2) {
            answer += s;
        }

        if(answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }
}
