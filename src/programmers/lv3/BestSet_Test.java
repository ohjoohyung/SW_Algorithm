package programmers.lv3;

public class BestSet_Test {
    //최고의 집합
    //생각보다 간단한 문제였는데 너무 돌아갔다.
    //검색 후 해결했다.
    //https://tosuccess.tistory.com/76 참고
    //요즘 너무 검색해서 해결하는거 같다. 큰일이다.
    public int[] solution(int n, int s) {
        int[] answer;
        if (n > s) {
            answer = new int[] {-1};
        }else {
            answer = new int[n];
            if (s % n == 0) {
                for (int i = 0; i < n; i++) {
                    answer[i] = s / n;
                }
            }else {
                int remain = s % n;
                int certificate = n - remain;
                for (int i = 0; i < certificate; i++) {
                    answer[i] = s / n;
                }
                for (int i = certificate; i < n; i++) {
                    answer[i] = s / n + 1;
                }
            }
        }

        return answer;
    }
}
