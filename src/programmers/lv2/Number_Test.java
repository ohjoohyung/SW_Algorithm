package programmers.lv2;

public class Number_Test {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                sum += j;
                if(sum >= n) {
                    if(sum == n) answer++;
                    sum = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
