package programmers.lv2;

import java.util.*;

public class Camouflage_Test {
    //위장
    //경우의 수 문제같은 수학적인 문제인줄 알고 풀긴했는데 각각의 경우의 수를 따져야 하나 하고 한시간 넘게 고민했다
    //근데 이렇게 안 입었을때 경우를 위해 +1을 해주고 다 곱한 뒤에 전부 안 입었을경우 수 1을 빼주는게 답일줄은 몰랐네
    //아마 고등학생때 이부분을 배우고 있었으면 금방 풀었을듯..
    //map.getOrDefault를 이용해서 배열의 중복값 개수를 뽑을 수 있다는거를 알아두자
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        int answer = 1;
        for(String key : map.keySet()) {
            answer *= (map.get(key)+1);
        }
        return answer-1;
    }
}
