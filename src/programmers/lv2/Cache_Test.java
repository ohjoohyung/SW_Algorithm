package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Cache_Test {
    //캐시
    //캐시 교체 알고리즘인 LRU를 알면 쉽게 풀 수 있다.
    //몰랐기에 검색해서 알고리즘을 이해하고 풀었다.
    //캐시 사이즈가 0이면 전부 미스, 도시 대소문자 구별하지 않는다는 것에 주의하자.
    public int solution(int cacheSize, String[] cities) {
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        for (String city : cities) {
            String newCity = city.toUpperCase();
            if (cacheSize == 0) {
                answer = cities.length * 5;
                break;
            }

            if (queue.contains(newCity)) {
                queue.remove(newCity);
                queue.add(newCity);
                answer += 1;
            }else {
                if (queue.size() >= cacheSize) {
                    queue.poll();
                }
                queue.add(newCity);
                answer += 5;
            }
        }
        return answer;
    }
}
