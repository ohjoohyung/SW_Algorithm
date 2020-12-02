package programmers.lv2;

public class Quad_Test {
    //쿼드압축 후 개수 세기
    //재귀로 해결
    //4개 나누면서 인덱스를 구하는 부분이 조금 헷갈렸다
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        method(arr, 0, 0, answer, arr.length);
        return answer;
    }
    static void method(int[][] arr, int rowIndex, int colIndex, int[] answer, int len){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=colIndex; i<len+colIndex; i++) {
            for(int j=rowIndex; j<len+rowIndex; j++) {
                if(arr[i][j] == 0) {
                    zeroCount++;
                }
                if(arr[i][j] == 1) {
                    oneCount++;
                }
            }
        }
        if(zeroCount == len * len) {
            answer[0]++;
            return;
        }else if(oneCount == len * len) {
            answer[1]++;
            return;
        }else {
            method(arr, rowIndex, colIndex, answer, len/2);
            method(arr,rowIndex+len/2, colIndex, answer, len/2);
            method(arr, rowIndex, colIndex+len/2, answer, len/2);
            method(arr, rowIndex+len/2, colIndex+len/2, answer, len/2);
        }
    }

}
