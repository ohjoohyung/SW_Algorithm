package programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelop_Test {
    //기능개발
    //큐에다가 작업일을 계산해서 집어넣고 그 계산일로 배포일에 따른 배포 개수를 계산해서
    //리스트에다 넣고 그걸 배열로 변환했다
    //나랑 비슷하긴한데 더 간단하게 큐 사이즈를 리스트에 넣어주는 사람도 있더라
    public int[] solution(int[] progresses, int[] speeds) {
        Queue qu = new LinkedList();
        for(int i = 0; i < progresses.length; i++) {
            qu.offer((int)Math.ceil((100-progresses[i]) / (float)speeds[i]));
        }
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        int count = 1;
        while (!qu.isEmpty()) {
            if((int)qu.peek() > tmp) {
                if(tmp == 0) {
                    tmp = (int)qu.poll();
                    continue;
                }
                tmp = (int)qu.poll();
                list.add(count);
                count = 1;
                continue;
            }else {
                count++;
                qu.poll();
            }
        }
        list.add(count);
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
