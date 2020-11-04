package programmers.lv2;

public class JoyStick_Test {
    //조이스틱
    //그리디 알고리즘
    //연속된 A만 신경쓰면 되는 문제였다.
    //상하 이동의 경우는 해결했으나 좌우 이동을 해결하지 못해서 검색 후 참고했다.
    public int solution(String name) {
        int up_down = 0;
        int min_move = name.length()-1;
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'M') {
                up_down += name.charAt(i)-'A';
            }else {
                up_down += 'Z'-name.charAt(i)+1;
            }

            int next = i+1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }

            min_move = Math.min(min_move, i+i+(name.length()-next));

        }
        return up_down+min_move;
    }
}
