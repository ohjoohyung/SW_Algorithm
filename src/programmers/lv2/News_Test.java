package programmers.lv2;

import java.util.HashMap;
import java.util.Map;


public class News_Test {
    //뉴스 클러스터링
    //문제를 잘못이해해서 바로잡는데 시간 약간 걸렸다.
    //map을 이용해서 해결
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        method(str1, map1);
        method(str2, map2);
        double answer = 0;
        int intersection = 0;
        int union = 0;
        for(String s : map1.keySet()) {
            if(map2.get(s) != null) {
                intersection += Math.min(map1.get(s), map2.get(s));
            }
            union += map1.get(s);
        }
        for(String s: map2.keySet()) {
            union += map2.get(s);
        }
        if(union == 0) {
            answer = 1;
        }else {
            answer = (double)intersection / (union - intersection);
        }


        return (int)Math.floor(answer*65536);
    }

    static void method(String str, Map<String, Integer> map) {
        str = str.toLowerCase();
        for(int i=0; i<str.length()-1; i++) {
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    && (str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z')) {
                map.put(str.substring(i, i+2), map.getOrDefault(str.substring(i,i+2),0)+1);
            }
        }
    }
}
