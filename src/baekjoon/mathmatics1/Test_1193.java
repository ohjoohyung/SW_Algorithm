package baekjoon.mathmatics1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1193 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int index = 1;
        while (true) {
            if(x==1) {
                System.out.println("1/1");
                break;
            }

            if(index*(index+1)/2 < x && (index+1)*(index+2)/2 >= x) {
                int val = x - ((index*(index+1)/2)+1);
                if(index%2 == 0) {
                    System.out.println((index+1-val)+"/"+(val+1));
                }else {
                    System.out.println((val+1)+"/"+(index+1-val));
                }
                break;
            }
            index++;
        }


    }


}
