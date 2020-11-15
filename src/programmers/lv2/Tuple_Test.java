package programmers.lv2;

import java.util.*;

public class Tuple_Test {
    //튜플
    //중복된 개수가 많은 수 순서로 배열을 만들면 되니까 map을 이용해 중복 수를 체크했다.
    //그 후 value 즉, 중복 수로 내림차순 정렬 후 배열에 집어넣었다.
    //근데 시간 초과는 아니지만 오래걸렸다 
    public int[] solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        String tmp = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                tmp += s.charAt(i);
                if(s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9') {
                    continue;
                }

                map.put(tmp, map.getOrDefault(tmp, 0)+1);
                tmp = "";
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2)-map.get(o1);
            }
        });
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}
