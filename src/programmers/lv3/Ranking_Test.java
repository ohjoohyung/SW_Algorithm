package programmers.lv3;

public class Ranking_Test {
    //순위
    //플로이드 워셜 알고리즘 문제
    //플로이드 워셜 알고리즘을 몰랐기에 검색 후 해결
    //https://in-intuition.tistory.com/25 이 블로그에서 참고했다.
    public int solution(int n, int[][] results) {
        int answer = 0;

        boolean[][] game = new boolean[n][n];
        for (int i = 0; i < results.length; i++) {
            game[results[i][0]-1][results[i][1]-1] = true;
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    if (game[j][i] && game[i][k])
                        game[j][k] = true;

        for (int i = 0; i < n; i++) {
            int result = 0;
            for (int j = 0; j < n; j++) {
                if (game[i][j] || game[j][i])
                    result++;
            }
            if (result == n - 1) answer++;
        }

        return answer;
    }
}
