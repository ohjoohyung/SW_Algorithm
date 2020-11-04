package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1541 {
    //백준 1541번
    //그리디 알고리즘
    //-50+30+20과 같이 -뒤에 +가 나오면 숫자를 +만큼 먼저 더해준뒤 -해주었다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(),"+-", true);
        String[] strings = new String[st.countTokens()];
        for(int i=0; i<strings.length; i++) {
            strings[i] = st.nextToken();
        }
        int index = 1;
        int answer = Integer.parseInt(strings[0]);
        while(index < strings.length) {
            if(strings[index].equals("+")) {
                answer += Integer.parseInt(strings[index+1]);
            }else {
                int next = index+2;
                int tmp = Integer.parseInt(strings[index+1]);
                if(next < strings.length && strings[next].equals("+")) {
                    while (next < strings.length && strings[next].equals("+")) {
                        tmp += Integer.parseInt(strings[next+1]);
                        next=next+2;
                    }
                    index = next-2;
                }
                System.out.println(tmp);
                answer -= tmp;
            }
            index = index + 2;
        }
        System.out.println(answer);


    }
}
