package programmers.lv2;

public class MakePrimeNum_Test {
    //소수 만들기
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                for(int k=j+1; k<len; k++) {
                    int num = nums[i]+nums[j]+nums[k];
                    if(isPrimeNum(num)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean isPrimeNum(int n) {
        if(n == 1) return false;
        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
