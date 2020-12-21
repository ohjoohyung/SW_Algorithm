package programmers.lv3;

public class Words_Change_Test {
    //단어 변환
    //dfs문제
    //간만에 dfs 문제 풀어보려니 힘드네..
    //이런 식으로 풀면 되지 않을까라고 생각만 했지 실제로 구현을 하지는 못했다..
    //내가 생각해낸 것도 dfs 였고 그걸 이런 식으로 구현할 줄 알아야 한다.
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        boolean[] check = new boolean[words.length];
        dfs(begin, target, words, check, 0);
        return answer;
    }

    static void dfs(String prev, String target, String[] words, boolean[] check, int count) {
        if (prev.equals(target)) {
            answer = count;
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (!check[i]) {
                if (checkWords(prev, words[i])) {
                    check[i] = true;
                    dfs(words[i], target, words, check, count+1);
                    check[i] = false;
                }
            }
        }
    }

    static boolean checkWords(String prev, String now) {
        int checkCount = 0;
        for (int i = 0; i < prev.length(); i++) {
            if (prev.charAt(i) != now.charAt(i)) {
                checkCount++;
            }
        }
        return checkCount == 1;
    }
}
