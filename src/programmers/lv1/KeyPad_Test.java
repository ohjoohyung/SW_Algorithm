package programmers.lv1;

public class KeyPad_Test {
    //키패드 누르기
    //생각하는데 좀 걸리긴 했는데 풀었다
    //테스트케이스 13번부터 쭉 오류가 나서 확인해보니까 거리 계산을 유클리드 거리 계산법으로 사용해서 오류가났다
    //맨하탄 거리 계산법으로 고쳐주니 잘 풀렸다 (처음에 이렇게 생각했었는데...)
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keyPad = {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        int[] beforeLeft = {3,0};
        int[] beforeRight = {3,2};
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                beforeLeft[0] = numbers[i]/3;
                beforeLeft[1] = 0;
                answer += "L";
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                beforeRight[0] = (numbers[i]/3)-1;
                beforeRight[1] = 2;
                answer += "R";
            }else {
                for (int j = 0; j < 4; j++) {
                    for (int l = 0; l < 3; l++) {
                        if (keyPad[j][l] == numbers[i]) {
                            int leftInterval = (beforeLeft[0]-j >= 0 ? beforeLeft[0]-j : j-beforeLeft[0]) +
                                    (beforeLeft[1]-l >= 0 ? beforeLeft[1]-l : l-beforeLeft[1]);

                            int rightInterval = (beforeRight[0]-j >= 0 ? beforeRight[0]-j : j-beforeRight[0]) +
                                    (beforeRight[1]-l >= 0 ? beforeRight[1]-l : l-beforeRight[1]);

                            if (leftInterval < rightInterval) {
                                beforeLeft[0] = j;
                                beforeLeft[1] = l;
                                answer += "L";
                            } else if (leftInterval > rightInterval) {
                                beforeRight[0] = j;
                                beforeRight[1] = l;
                                answer += "R";
                            } else {
                                if (hand.equals("left")) {
                                    answer += "L";
                                    beforeLeft[0] = j;
                                    beforeLeft[1] = l;
                                } else {
                                    answer += "R";
                                    beforeRight[0] = j;
                                    beforeRight[1] = l;
                                }
                            }
                            break;
                        }

                    }
                }
            }

        }
        return answer;
    }
}
