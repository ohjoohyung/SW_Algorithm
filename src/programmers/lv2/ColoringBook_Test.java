package programmers.lv2;

public class ColoringBook_Test {
    //카카오프렌즈 컬러링북
    //dfs로 해결
    static int size = 0;
    static int[] rRow = {1, -1, 0 ,0};
    static int[] rCol = {0, 0, 1, -1};
    public int[] solution(int m, int n, int[][] picture) {
        int cnt = 0;
        int maxSize = 0;
        boolean[][] isVisited = new boolean[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(picture[i][j] > 0 && !isVisited[i][j]) {
                    cnt++;
                    dfs(picture[i][j], m, n, i, j, isVisited, picture);
                    if(size > maxSize) maxSize = size;
                    size = 0;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = maxSize;
        return answer;
    }
    static void dfs(int num, int m, int n, int i, int j, boolean[][] isVisited, int[][] picture) {
        if(!isVisited[i][j]) {
            isVisited[i][j] = true;
            size++;
        }
        for(int k=0; k<4; k++) {
            int newRow = i+rRow[k];
            int newCol = j+rCol[k];
            if(newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) continue;
            if(!isVisited[newRow][newCol] && picture[newRow][newCol] == num) {
                dfs(num, m, n, newRow, newCol, isVisited, picture);
            }
        }
    }
}
