package programmers.lv2;

public class String_Test {
    //문자열 압축
    //너무 어렵게 느껴졌다...
    //쓸데없이 복잡하게 푼 느낌
    //xxxxxxxyyy와 같은 예외가 있기때문에 중복이 나왔다고 바로 break 걸면 안되더라
    //결국 마지막에 구글링해서 Math.min으로 최솟값을 구했다
    public int solution(String s) {
        int answer = 1001;
        String result = "";
        int half = s.length() / 2;
        if(s.length() == 1) {
            return 1;
        }
        while (half > 0) {
            String now, next = "";
            int hit = 1;
            for(int i = 0; i < (int)Math.ceil(s.length() / (float)half)-1; i++) {
                now = s.substring(half*i,half*(i+1));
                if(i == (int)Math.ceil(s.length() / (float)half)-2) {
                    next = s.substring(half*(i+1));
                }else {
                    next = s.substring(half*(i+1),half*(i+2));
                }
                if(now.equals(next)) {
                    hit++;
                }else {
                    if(hit > 1) {
                        result += hit + now;
                        hit = 1;
                    }else {
                        result += now;
                    }
                }
                if(i == (int)Math.ceil(s.length() / (float)half)-2) {
                    if(hit > 1) {
                        result += hit + next;
                    }else {
                        result += next;
                    }

                }

            }
            half--;
            answer = Math.min(answer, result.length());
            result = "";

        }
        return answer;
    }
}
