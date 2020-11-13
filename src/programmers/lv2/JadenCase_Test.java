package programmers.lv2;

public class JadenCase_Test {
    //JadenCase 문자열 만들기
    //공백으로 나누고 풀었다.
    //근데 이럴 경우 마지막 문자에 공백이 있을 경우 나오지 않아서 따로 조건을 추가해주었다.
    public String solution(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sArr.length; i++) {
            String tmp = sArr[i];
            for(int j=0; j<tmp.length(); j++) {
                char cTmp = tmp.charAt(j);
                if(j == 0) {
                    if(cTmp >= 'a' && cTmp <= 'z') {
                        cTmp = (char) (cTmp - 32);
                    }
                }else {
                    if(cTmp >= 'A' && cTmp <= 'Z') {
                        cTmp = (char) (cTmp + 32);
                    }
                }
                sb.append(cTmp);
            }
            if(i < sArr.length-1) {
                sb.append(" ");
            }
        }
        if(s.charAt(s.length()-1) == ' ') {
            sb.append(" ");
        }
        return sb.toString();
    }

    //이런식으로 문자열 함수와 flag 이용해서 간단하게 푸는 방법도 있다.
    //이게 마지막 문자 공백 조건문 추가 안해도 되고 더 좋은듯
    public String anotherSolution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
