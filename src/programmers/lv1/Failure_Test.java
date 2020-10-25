package programmers.lv1;

import java.util.Arrays;

public class Failure_Test {
    //실패율
    //반복문 여러번 사용해서 효율성은 안좋은거 같으나 문제는 잘 풀린다
    //실패율은 구하기 쉬우나 순서가 담긴 배열을 만드는게 조금 헷갈렸다
    //Stage 클래스를 만들어서 푸는 경우도 있따
    public static void main(String[] args) {
        int n = 4;
        int[] stages = {1,1,1,2};
        double[] failure = new double[n];
        Arrays.sort(stages);
        double userCount = stages.length;
        double failCount = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j< stages.length; j++) {
                if(i+1 == stages[j]) {
                    failCount++;
                }else if(i+1 < stages[j]) {
                    break;
                }
            }
            if(userCount == 0) {
                failure[i] = 0;
            }else {
                failure[i] = failCount / userCount;
                userCount -= failCount;
                failCount = 0;
            }

            System.out.println(failure[i]);
        }
        int[] result = new int[n];
        double max = -1;
        int maxIndex = 0;
        int index = 0;
        while(index < n) {
            for(int i=0; i<n; i++) {
                if(failure[i] > max) {
                    max = failure[i];
                    maxIndex = i;
                }
            }
            failure[maxIndex] = -1;
            result[index++] = maxIndex+1;
            max = -1;
            maxIndex = 0;
        }

        for(int i: result) {
            System.out.println(i);
        }




    }
}
