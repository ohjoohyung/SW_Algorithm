package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_Test {
    public static void main(String[] args) throws IOException {
        //8595번
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        s = s.replaceAll("[^0-9]"," ");
        long answer = 0;
        String[] sArr = s.trim().split(" ");
        for(int i=0; i<sArr.length; i++) {
            if(!sArr[i].equals(" ") && !sArr[i].equals("")) {
                if(sArr[i].length() <= 6) {
                    answer += Integer.parseInt(sArr[i]);
                }
            }
        }
        System.out.println(answer);
//        String num = "";
//        boolean flag = false;
//        for(int i=0; i<cArr.length; i++) {
//            if(cArr[i] == ' ' && !flag) {
//                flag = true;
//            }
//            if(flag) {
//                if(cArr[i] >= '0' && cArr[i] <='9') {
//                    num += cArr[i];
//                    if(i == cArr.length-1) break;
//                    if(cArr[i+1]==' ') {
//                        if(num.length() <= 6) {
//                            answer += Integer.parseInt(num);
//                        }
//                        num = "";
//                    }
//                }
//            }
//
//            System.out.println(num);
        }

    }

