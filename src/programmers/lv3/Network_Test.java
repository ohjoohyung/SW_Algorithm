package programmers.lv3;

public class Network_Test {
    //네트워크
    //dfs 기본 문제인데 너무 얼탔다..
    //복습하자
    //검색 후 참고해서 해결
    public int solution(int n, int[][] computers) {
        boolean[] check = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++) {
            if(!check[i]) {
                dfs(i, computers, check);
                answer++;
            }
        }
        return answer;
    }
    static void dfs(int i, int[][] computers, boolean[] check) {
        check[i] = true;
        for(int j=0; j< computers.length; j++) {
            if(computers[i][j] == 1 && !check[j] && i != j) {
                dfs(j, computers, check);
            }
        }
    }

}
