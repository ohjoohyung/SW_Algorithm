package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = s.split(" ");
        long n = 0;
        if((Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) <= 0) {
            n = -1;
        }else{
            n = Long.parseLong(sArr[0]) / (Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) + 1;
        }
        System.out.println(n);

    }
}
