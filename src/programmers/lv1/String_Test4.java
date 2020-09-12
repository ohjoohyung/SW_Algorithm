package programmers.lv1;

public class String_Test4 {

    //마지막에 trim 썼다가 테스트는 통과하는데 제출하면 실패가 떴다
    //왜 그런지는 정확히 모르겠으나 대신 substring 써라는 조언을 보고 바꾸니까 성공
    //split 뒤에 limit로 -1을 넣는 이유는 만약 뒤에 공백이 더 추가된 상태로
    //String이 나올 경우 그거도 포함해주기 위해서라는데 사실 잘 모르겠다..
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ", -1);
        for(String a : sArr) {
            a = a.toUpperCase();
            char[] cArr = a.toCharArray();
            for(int i = 1; i < cArr.length; i += 2) {
                if(cArr[i] >= 65 && cArr[i] <= 90) {
                    cArr[i] = (char)(cArr[i] + 32);
                }
            }
            a = String.valueOf(cArr);
            answer += a + " ";
        }
        return answer.substring(0, answer.length() - 1);
    }
}
