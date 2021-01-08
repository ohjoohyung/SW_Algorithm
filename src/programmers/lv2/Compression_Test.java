package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Compression_Test {
    //압축
    //dictionary를 LinkedList로 했는데 다른 사람들 풀이를 보니 HashMap으로 해결한 풀이도 존재.
    public int[] solution(String msg) {
        List<String> dictionary = new LinkedList<>();
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            char tmp = (char)('A'+i);
            dictionary.add(tmp+"");
        }
        int index = 0;
        while (true) {
            for (int i = 0; i <= msg.length(); i++) {
                String w = msg.substring(index, msg.length()-i);
                if (dictionary.contains(w)) {
                    index += msg.length()-i-index;
                    int wIndex = dictionary.indexOf(w);
                    answers.add(wIndex+1);
                    if (index == msg.length()) {
                        break;
                    }
                    dictionary.add(w + msg.charAt(index));
                    break;
                }
            }

            if (index == msg.length()) {
                break;
            }
        }
        int[] answer = new int[answers.size()];
        for (int i = 0; i < answers.size(); i++) {
            answer[i] = answers.get(i);
        }
        return answer;
    }
}
