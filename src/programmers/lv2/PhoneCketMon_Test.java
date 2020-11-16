package programmers.lv2;

import java.util.Arrays;

public class PhoneCketMon_Test {
    //폰켓몬
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int tmp = 0;
        int chance = nums.length/2;
        int answer = 0;
        for(int n : nums) {
            if(tmp != n) {
                tmp = n;
                chance--;
                answer++;
                if(chance == 0) break;
            }
        }
        return answer;
    }
}
