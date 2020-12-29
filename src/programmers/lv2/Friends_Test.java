package programmers.lv2;

public class Friends_Test {
    //프렌즈4블록
    //시간이 좀 걸렸지만 풀었다.
    public int solution(int m, int n, String[] board) {
        char[][] originalBoard = new char[m][n];
        char[][] tmpBoard = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                originalBoard[i][j] = board[i].charAt(j);
                tmpBoard[i][j] = board[i].charAt(j);
            }
        }

        int answer = 0;
        while (true) {
            int tmpCount = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    search(originalBoard, tmpBoard, i, j);
                }
            }

            for (int i = m - 1; i > 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (tmpBoard[i][j] == ' ') {
                        down(originalBoard, tmpBoard, i, j);
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (tmpBoard[i][j] == ' ') {
                        tmpCount++;
                    }
                }
            }

            if (tmpCount != answer) {
                answer = tmpCount;
            }else {
                break;
            }
        }
        return answer;
    }
    static void search(char[][] originalBoard, char[][] tmpBoard, int i, int j) {
        if (originalBoard[i][j] == originalBoard[i][j+1] && originalBoard[i][j+1] == originalBoard[i+1][j+1]
                && originalBoard[i+1][j+1] == originalBoard[i+1][j] && originalBoard[i+1][j] == originalBoard[i][j]) {
            tmpBoard[i][j] = ' ';
            tmpBoard[i][j+1] = ' ';
            tmpBoard[i+1][j+1] = ' ';
            tmpBoard[i+1][j] = ' ';
        }
    }

    static void down(char[][] originalBoard, char[][] tmpBoard, int i, int j) {
        int tmp = i;
        while (true) {
            if (tmpBoard[i][j] != ' ' || i < 1) {
                break;
            }
            i--;

        }
        tmpBoard[tmp][j] = tmpBoard[i][j];
        tmpBoard[i][j] = ' ';
        originalBoard[tmp][j] = originalBoard[i][j];
        originalBoard[i][j] = ' ';
    }
}
