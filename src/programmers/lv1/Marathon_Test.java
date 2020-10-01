package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon_Test {
    //완주하지 못한 선수
    //정렬을 해서 풀었다
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if(answer.equals("")) {
            answer = participant[participant.length-1];
        }
        return answer;

    }

    //근데 문제 주제가 해시인만큼 이런식으로 해시맵 만들어서 푸는게 더 좋을듯
    //해시맵으로 문제 푸는 생각을 하자
    public String anotherSolution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
