package programmers.lv1;

public class Dart_Game {
    //다트게임
    //생각해보니 어렵지 않은 문제인데 너무 이상하게 접근한것 같다
    //핵심은 점수를 저장할 수 있는 배열을 만들어 사용하는 것과
    //숫자가 10일때 i++;를 해주는 것
    public int solution(String dartResult) {
        char[] dart = dartResult.toCharArray();
        int[] score = new int[3];
        int index = -1;
        int answer = 0;
        for(int i=0; i<dart.length; i++) {
            if(dart[i]>='0' && dart[i]<='9') {
                index++;
                if(dart[i] == '1' && dart[i+1] == '0') {
                    score[index] = 10;
                    i++;
                }else {
                    score[index] = dart[i]-'0';
                }
            }else if(dart[i] == 'D') {
                score[index] *= score[index];
            }else if(dart[i] == 'T') {
                score[index] *= score[index] * score[index];
            }else if(dart[i] == '#') {
                score[index] *= -1;
            }else if(dart[i] == '*') {
                score[index] *= 2;
                if(index >= 1) {
                    score[index-1] *= 2;
                }
            }
        }
        answer = score[0]+score[1]+score[2];
        return answer;
    }
}
