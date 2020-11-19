package programmers.lv2;

public class Words_Test {
    //영어 끝말잇기
    public int[] solution(int n, String[] words) {
        char tmp = ' ';
        int index = 0;
        for(int i=0; i<words.length; i++) {
            String tmpWords = words[i];
            if(i != 0) {
                if(tmp != tmpWords.charAt(0)) {
                    index = i;
                    break;
                }
                for(int j=0; j<i; j++) {
                    if(tmpWords.equals(words[j])) {
                        index = i;
                        break;
                    }
                }

            }
            if(index != 0) break;
            tmp = tmpWords.charAt(tmpWords.length()-1);
        }
        int[] answer = new int[2];
        if(index != 0) {
            answer[0] = (index+1)%n == 0 ? n : (index+1)%n;
            answer[1] = (index+1)%n == 0 ? (index+1)/n : (index+1)/n +1;
        }
        return answer;
    }
}
