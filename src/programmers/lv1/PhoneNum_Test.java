package programmers.lv1;

public class PhoneNum_Test {

    //뒤에 숫자 4개 뽑아내고 앞에 숫자 전부 *로 replaceAll 이용해서 바꿔준뒤 합쳤다.
    //참고로 replaceAll은 앞에 파라미터를 정규식으로도 받아서 저런식이 가능함
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String num = phone_number.substring(length - 4, length);
        answer = phone_number.substring(0, length - 4).replaceAll(".","*") + num;
        return answer;
    }
}
