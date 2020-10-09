package programmers.lv2;

public class OneTwoFour_Test {
    //124 나라의 숫자
    //규칙만 알면 쉬운문제
    //근데 코드는 드럽게 짬. 난 코드 드럽게 짜는데 일가견이 있는듯
    //StringBuilder에 insert 쓰면 앞에서부터 붙일 수 있는데 생각해보니 이렇게 할 필요가없는듯
    //중복된 코드 오지네
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int r = n % 3;
            System.out.println(r);
            if(r == 1) {
                sb.insert(0, 1);
            }else if(r == 2) {
                sb.insert(0, 2);
            }else {
                sb.insert(0, 4);
            }
            if(n == 1 || n == 2 || n == 3) {
                break;
            }else if(n % 3 == 0) {
                n = n / 3 - 1;
            }else {
                n /= 3;
            }
        }
        return sb.toString();
    }

    //이렇게 간단하게 짤 수 있다
    public String anotherSolution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}
