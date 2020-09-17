package programmers.lv1;

public class HarshadNum_Test {
    //하샤드 수 문제
    //자릿수를 더하기 위해 string으로 바꾸고 split로 하나 하나 잘라서 더했다
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = (x + "").split("");
        int n = 0;
        for(int i = 0; i < arr.length; i++) {
            n += Integer.parseInt(arr[i]);
        }
        answer = x % n == 0 ? true : false;
        return answer;
    }
}
