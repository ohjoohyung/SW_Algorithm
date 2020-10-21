package programmers.lv1;


public class Training_Test {
    //체육복 문제
    //그리디 문제로 핵심은 잃어버렸지만 여분을 가지고 온 학생을 먼저 해결해줘야하는게 핵심
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;

                }
            }
        }
        for(int i = 0; i < reserve.length; i++) {
            if(reserve[i] == -1) {
                continue;
            }
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] == lost[j]-1 || reserve[i] == lost[j]+1) {
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }
        return answer;

    }
    
    //이런식으로 전체 학생 배열을 만들어 해결하는 방법도 있다
    public int anotherSolution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }
        return answer;
    }
}
