package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_Test {



    //2178번
    //BFS 활용하는게 어렵네.. 설계를 하고 코딩을 하자
    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};
    static int n, m;

    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        boolean[][] check = new boolean[n+1][m+1];
        for(int i=1; i<=n; i++) {
            char[] cArr = br.readLine().toCharArray();
            for(int j=1; j<=m; j++) {
                arr[i][j] = cArr[j-1]-'0';
            }
        }

        Queue<Item> que = new LinkedList<Item>();
        Item item = new Item(1, 1, 1);
        que.add(item);
        check[1][1] = true;
        int answer = 0;
        while(!que.isEmpty()) {
            //null 포인터 오류 -> null 값을 참조하려고 할때 발생
            //que.poll()는 큐가 비어져있을때도 사용 가능
            Item tmpItem = que.poll();

            int row = tmpItem.row;
            int col = tmpItem.col;
            int cnt = tmpItem.cnt;

            if(row == n && col == m) {
                answer = cnt;
                break;
            }

            for(int i=0; i<4; i++) {
                int newRow = row+dRow[i];
                int newCol = col+dCol[i];
                if(valueCheck(newRow, newCol) && arr[newRow][newCol] == 1) {
                    if(!check[newRow][newCol]) {
                        que.add(new Item(newRow, newCol, cnt+1));
                        check[newRow][newCol] = true;
                    }
                }
            }
//			if(row+1<=n && arr[row+1][col] == 1) {
//				if(!check[row+1][col]) {
//					que.add(new Item(row+1, col, cnt+1));
//					check[row+1][col] = true;
//				}
//			}
//
//			if(col+1<=m && arr[row][col+1] == 1) {
//				if(!check[row][col+1]) {
//					que.add(new Item(row, col+1, cnt+1));
//					check[row][col+1] = true;
//				}
//			}
//
//			if(row-1>=1 && arr[row-1][col] == 1) {
//				if(!check[row-1][col]) {
//					que.add(new Item(row-1, col, cnt+1));
//					check[row-1][col] = true;
//				}
//			}
//
//			if(col-1>=1 && arr[row][col-1] == 1) {
//				if(!check[row][col-1]) {
//					que.add(new Item(row, col-1, cnt+1));
//					check[row][col-1] = true;
//				}
//			}
//




        }
        System.out.println(answer);


    }

    static boolean valueCheck(int newRow, int newCol) {
        if(newRow < 1 || newRow > n || newCol < 1 || newCol > m) {
            return false;
        }
        return true;
    }

}

class Item {
    int row;
    int col;
    int cnt;

    Item(int row, int col, int cnt) {
        this.row = row;
        this.col = col;
        this.cnt = cnt;
    }
}
