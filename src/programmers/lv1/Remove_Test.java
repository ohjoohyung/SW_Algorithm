package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Test {
    //배열의 최솟값을 구하고 그걸 제외한 새로운 배열을 리턴하는 문제인데 최솟값 구하는건 어렵지 않았는데 그걸 제외하고
    //새로운 배열을 만드는게 좀 까다로웠다
    //그래서 ArrayList 만들어서 쉽게 값 넣고 그걸 배열로 만들었다
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length > 1) {
            int lowest = 0;
            for(int i = 0; i < arr.length; i++) {
                if(i == 0) {
                    lowest = arr[i];
                    continue;
                }
                if(lowest > arr[i]) {
                    lowest = arr[i];
                }
            }
            List<Integer> list = new ArrayList<Integer>();
            for(int i : arr) {
                if(i == lowest) {
                    continue;
                }
                list.add(i);
            }
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }

    //근데 이제 이런식으로 JAVA8 문법인 stream과 filter를 활용해서 풀 수 있더라고,,
    //이건 람다를 모르니까 공부를 해야될거같다..
    public int[] anotherSolution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
