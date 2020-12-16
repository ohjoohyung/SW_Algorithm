package programmers.lv2;

public class Binary_Test {
    //이진 변환 반복하기
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            int zeroCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                    zeroCount++;
                }
            }
            s = Integer.toBinaryString(s.length() - zeroCount);
            answer[0]++;
        }
        return answer;
    }
}
