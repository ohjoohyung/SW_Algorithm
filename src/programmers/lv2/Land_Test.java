package programmers.lv2;

import java.util.Stack;

public class Land_Test {
    public static void main(String[] args) {
        //땅따먹기
        //처음에 dfs로 모든 경우의 수를 구하는 어림도 없는 방법으로 생각하고 구현했다.
        //그 결과, 처음 테스트는 통과해도 나머지는 전부 시간초과 떴다.
        //검색 후 내가 너무 복잡하게 생각했다는 것을 깨닫고 반성했다..
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int answer = 0;
        for(int i=1; i< land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][1]));
        }

        for(int i=0; i< 4; i++) {
            int value = land[land.length-1][i];
            answer = value > answer ? value : answer;
        }
        System.out.println(answer);
//        boolean[][] check = new boolean[land.length][land[0].length];
//        Stack<Point> stack = new Stack<>();
//        int max = 0;
//        for(int i=0; i<4; i++) {
//            int answer = 0;
//            answer += land[0][i];
//            stack.add(new Point(answer,0, i));
//            System.out.println(answer);
//
//            while (!stack.isEmpty()) {
//                Point tmpPoint = stack.peek();
//                System.out.println(tmpPoint.num+"/"+ tmpPoint.row+"/"+ tmpPoint.col);
//                if(!check[tmpPoint.row][tmpPoint.col]) {
//                    check[tmpPoint.row][tmpPoint.col] = true;
//                }
//                boolean flag = false;
//                for(int j=0; j<4; j++) {
//                    int tmpRow = tmpPoint.row;
//                    int tmpCol = tmpPoint.col;
//                    if(tmpRow+1< land.length) {
//                        if(tmpCol != j && !check[tmpRow+1][j]) {
//                            answer += land[tmpRow+1][j];
//                            stack.add(new Point(answer,tmpRow+1,j));
//
//                            flag = true;
//                            break;
//                        }
//                    }else {
//                        max = tmpPoint.num > max ? tmpPoint.num : max;
//                        break;
//                    }
//                }
//                if(!flag) {
//                    if(tmpPoint.row != land.length -1) {
//                        for(int k=0; k<4; k++) {
//                            check[tmpPoint.row+1][k] = false;
//                        }
//                    }
//                    stack.pop();
//                    answer = tmpPoint.num-land[tmpPoint.row][tmpPoint.col];
//                }
//            }
//
//        }
//        System.out.println(max);
    }



    static class Point {
        int num;
        int row;
        int col;
        Point(int num, int row, int col) {
            this.num = num;
            this.row = row;
            this.col = col;
        }
    }
}
