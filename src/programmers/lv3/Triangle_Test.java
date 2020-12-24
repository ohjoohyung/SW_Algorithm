package programmers.lv3;

public class Triangle_Test {
    //정수 삼각형
    //dp문제
    //밑에서부터 더하면서 큰 값을 구했다.
    //전에 비슷한 문제 풀어봤기 때문에 쉽게 풀었다.
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 1; i >= 1; i--) {
            for (int j = 0; j < triangle[i].length - 1; j++) {
                triangle[i - 1][j] = Math.max(triangle[i][j] + triangle[i - 1][j], triangle[i][j + 1] + triangle[i - 1][j]);
            }
        }
        return triangle[0][0];
    }
}
