package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat_Test {
    //오픈채팅방
    //map을 사용하여 들어왔던 유저 정보를 저장하고 list를 이용하여 닉네임이 아닌 아이디로 이루어진 출력문을 저장 후
    //다시 for문을 돌며 그 아이디를 닉네임으로 바꾸었다.
    //근데 이건 먼저 아이디로 이루어진 출력문을 만들었다는게 문제에 약간 벗어나는게 아닌가 싶어
    //좋은건지는 잘 모르겠다만 나중에 그 아이디를 이용해서
    //닉네임으로 이루어진 출력문을 만드나 미리 만들어 놓나 사실 똑같지 않나 생각된다.
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0; i< record.length; i++) {
            String[] tmp = record[i].split(" ");
            if(tmp[0].equals("Enter")) {
                map.put(tmp[1], tmp[2]);
                list.add(tmp[1]+"님이 들어왔습니다.");
            }else if(tmp[0].equals("Leave")) {
                list.add(tmp[1]+"님이 나갔습니다.");
            }else {
                map.put(tmp[1], tmp[2]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            String[] tmp = list.get(i).split("님");
            String id = tmp[0];
            answer[i] = map.get(id) + "님" + tmp[1];
        }
        return answer;
    }
}
