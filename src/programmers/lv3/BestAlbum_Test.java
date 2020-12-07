package programmers.lv3;

import java.util.*;

public class BestAlbum_Test {
    //베스트 앨범
    //Hashmap을 이욯하고 정렬에서는 Collections.sort를 사용했다
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();
        for (int i=0; i < plays.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1,o2) -> map.get(o2).compareTo(map.get(o1)));
        for (int i=0; i<keySetList.size(); i++) {
            Map<Integer, Integer> tmpMap = new HashMap<>();
            for (int j=0; j<genres.length; j++) {
                if (keySetList.get(i).equals(genres[j])) {
                    tmpMap.put(j, plays[j]);
                }
            }
            List<Integer> tmpKeySetList = new ArrayList<>(tmpMap.keySet());
            Collections.sort(tmpKeySetList, (o1,o2) -> tmpMap.get(o2).compareTo(tmpMap.get(o1)));
            for (int k = 0; k<tmpKeySetList.size(); k++) {
                answerList.add(tmpKeySetList.get(k));
                if (k == 1) break;
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
