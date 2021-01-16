package programmers.lv3;

public class Road_Test {
    //등굣길
    //처음에 dfs로 해봤다가 m, n 100일 때 실험해보니 끝나지 않는다는걸 보고 바로 동적계획법으로 풀었음.
    //굳이 m > 1 이나 n > 1일 때 map[2][1], map[1][2]를 1로 두지 않고 map[1][1]을 1로 초기화하기만 하면 됨
    //그리고 난 puddles 인지 검사하기위한 메소드를 만들었는데 그냥 map에다 -1과 같은 수로 표시해두는게 더 나을듯.
    //난 매번 메소드를 호출하니 메모리나 시간을 잡아먹는다.
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[m+1][n+1];
        if (m > 1) {
            if (!isPuddles(2, 1, puddles)) {
                map[2][1] = 1;
            }
        }
        if (n > 1) {
            if (!isPuddles(1, 2, puddles)) {
                map[1][2] = 1;
            }
        }
        if (m > 1 && n > 1) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (!isPuddles(i, j, puddles) && map[i][j] == 0) {
                        map[i][j] = (map[i-1][j] + map[i][j-1]) % 1000000007;
                    }
                }
            }
        }
        return map[m][n];

    }
    static boolean isPuddles(int x, int y, int[][] puddles) {
        for (int i = 0; i < puddles.length; i++) {
            if (puddles[i][0] == x && puddles[i][1] == y) {
                return true;
            }
        }
        return false;
    }
}
