package programmers.lv2;

public class Biggest_Square_Test {
    //가장 큰 정사각형 찾기
    //검색하고 해결..
    //dp문제로 위, 왼쪽, 왼쪽 위가 1이고 자기 자신도 1일 경우 정사각형으로 보고 수를 축적시켜나가는 형식으로 푸는 문제
    //값을 더해주면서 max를 구해줘도 되는데
    //마지막에 한번 더 for문을 통해 max를 구해주는 이유는 이 때 {{1,0},{0,0}}과 같은 경우를 해결하기 위해
    public int solution(int [][]board)
    {
        int max = 0;
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = Math.min(board[i-1][j], Math.min(board[i-1][j-1], board[i][j-1]))+board[i][j];
                }

            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > max) {
                    max = board[i][j];
                }
            }
        }
        return (int)Math.pow(max,2);

    }
}
