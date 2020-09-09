package programmers.lv1;

public class Caesar_Cipher_Test {
    //시저 암호 문제
    //for문을 통해 돌린 각각의 문자를 또 for문을 통해 1씩 더 해주며 조건에 따라 식을 바꿔주기로 했다
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                for (int j = 1; j <= n; j++) {
                    if ((char) c == 'z') {
                        c = 'a';
                    } else if ((char) c == 'Z') {
                        c = 'A';
                    } else {
                        c++;
                    }
                }
            }
            answer = (char)c + "";
        }
        return answer;
    }

    //근데 저렇게 for문 2개 돌리는건 효율적이지 못한 방법인거 같고
    //이런식으로 알파벳 개수를 이용해 밀어버리는 식으로 사용하더라
    String caesar(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}
