package programmers.lv2;

public class BaseN_Test {
    //n진수 게임
    //좀 지저분하게 풀긴 했는데 풀었다.
    //진수 변환을 한 numbers의 길이가 m*t보다 클 때 순서에 해당되는 문자를 answer에 담는 식으로 해결했다.
    public String solution(int n, int t, int m, int p) {
        String[] arr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String answer = "";
        String numbers = "";
        int num = 0;
        while (true) {
            if (num / n == 0) {
                numbers += arr[num];
            }else {
                String tmp = "";
                int tmpNum = num;
                while (true) {
                    tmp = arr[tmpNum % n] + tmp;
                    tmpNum /= n;
                    if (tmpNum < n) {
                        tmp = arr[tmpNum] + tmp;
                        break;
                    }
                }

                numbers += tmp;
            }

            num++;
            if (numbers.length() >= t * m) {
                for (int i = 0; i < numbers.length(); i++) {
                    if (t == 0) break;
                    if ((i + 1) % m == 0 && m == p) {
                        answer += numbers.charAt(i);
                        t--;
                        continue;
                    }
                    if ((i + 1) % m == p) {
                        answer += numbers.charAt(i);
                        t--;
                    }
                }
                break;
            }
        }
        return answer;
    }
}
