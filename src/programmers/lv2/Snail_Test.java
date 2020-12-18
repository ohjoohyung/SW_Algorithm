package programmers.lv2;

public class Snail_Test {
    //삼각 달팽이
    //이차원 배열을 만든 뒤 왼쪽으로 밀고 아래, 오른쪽, 대각선 왼쪽 위 방향 규칙을 찾으면 되는 문제
    //검색 후 해결
    public int[] solution(int n) {
        int tmpN = n;
        int[] numbers = new int[(n*(n+1))/2];
        int numbersIndex = 0;

        int[][] arr = new int[n][n];
        int value = 1;
        int row = -1;
        int col = 0;

        while (tmpN > 0) {
            for (int i = 0; i < tmpN; i++) {
                arr[++row][col] = value++;
            }
            tmpN--;
            for (int i = 0; i < tmpN; i++) {
                arr[row][++col] = value++;
            }
            tmpN--;
            for (int i = 0; i < tmpN; i++) {
                arr[--row][--col] = value++;
            }
            tmpN--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) break;
                numbers[numbersIndex++] = arr[i][j];
            }
        }
        return numbers;
    }
}
