package programmers.lv1;


public class String_Test2 {
    //하나의 메소드로도 문제를 해결할 수 있는데 그냥 숫자인지 판별해주는 기능을 가진 메소드를 따로 빼서 만들어주었다
    public boolean solution(String s) {
        boolean answer = true;
        answer = s.length() == 4 || s.length() == 6 ? isNumber(s) : false;
        return answer;
    }

    public boolean isNumber(String a) {
        for(int i = 0; i < a.length(); i++) {
            if(0 <= a.charAt(i)-'0' && a.charAt(i)-'0' <= 9) {
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    //근데 다른사람 풀이보니까 이런 풀이가 있더라.. try catch를 이용할 줄이야.. 대단..
    public boolean anotherSolution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}

