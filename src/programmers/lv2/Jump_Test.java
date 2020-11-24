package programmers.lv2;

public class Jump_Test {
    //점프와 순간이동
    public int solution(int n) {
        int ans = 0;

        while(n != 0) {
            if(n % 2 == 1) {
                ans++;
                n -= 1;
            }
            n /= 2;
        }

        return ans;
    }
}
