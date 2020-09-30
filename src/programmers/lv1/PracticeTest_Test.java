package programmers.lv1;

import java.util.ArrayList;

public class PracticeTest_Test {
    //모의고사 문제
    //마지막 최대값을 구하고 배열을 만드는게 어려웠다
    //이렇게 짜긴했는데 좀 많이 더러운거같다..
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i % 5]) {
                count[0]++;
            }
            if(answers[i] == arr2[i % 8]) {
                count[1]++;
            }
            if(answers[i] == arr3[i % 10]) {
                count[2]++;
            }
        }


        int maxCount = 0;
        boolean[] bArr = {false, false, false};
        for(int i = 0; i < count.length; i++) {
            System.out.println("count : " + count[i]);
            if(count[i] > maxCount) {
                for(int j = 0; j < bArr.length; j++) {
                    bArr[j] = false;
                }
                maxCount = count[i];
                bArr[i] = true;
            }else if(count[i] == maxCount) {
                bArr[i] = true;
            }
        }

        int length = 0;
        for(boolean b : bArr) {
            if(b) {
                length++;
            }
        }
        int[] answer = new int[length];
        int index = 0;

        for(int i = 0; i < bArr.length; i++) {
            System.out.println(bArr[i]);
            if(bArr[i]) {
                answer[index++] = i+1;
            }

        }
        return answer;
    }


    //이런식으로 간결하게 짠 코드도 있었다
    //마지막을 ArrayList를 만들고 그걸 배열로 바꾸는 식으로 풀은듯
    public int[] anotherSolution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
