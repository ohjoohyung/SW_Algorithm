package programmers.lv2;

import java.util.Arrays;
import java.util.Collections;

public class Boat_Test {
    //구명보트
    //그리디 알고리즘
    //최대 2명이라고 적혀있으니 2명 씩 묶어야한다
    public int solution(int[] people, int limit) {
        int startIndex = 0;
        int answer = people.length;
        Arrays.sort(people);

        for(int i= people.length-1; i >= 0; i--) {
            if(i <= startIndex) {
                break;
            }
            if(people[i] + people[startIndex] <= limit) {
                answer--;
                startIndex++;
            }

        }
        return answer;
    }
}
