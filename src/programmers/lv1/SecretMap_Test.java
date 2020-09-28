package programmers.lv1;

import java.util.Scanner;

public class SecretMap_Test {
    //비밀지도 문제
    //이런식으로 풀긴 했지만 Integer.toBinaryString(arr1[i] | arr2[i]) 이렇게 더해서 한번에
    //이진수를 구하면 더 편했을듯
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            while(binary1.length() != n || binary2.length() != n) {
                binary1 = binary1.length() == n ? binary1 : "0"+binary1;
                binary2 = binary2.length() == n ? binary2 : "0"+binary2;
            }
            String s1 = "";
            for(int j = 0; j < n; j++) {
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    s1 += "#";
                }else {
                    s1 += " ";
                }
            }
            answer[i] = s1;
        }
        return answer;

    }


    //그리고 이런 재귀함수를 만들어서 사용한 사람들껄 봤다
    //대단하다 정말..
    public String makeSharp(int n, int m) {
        if(n == 0) {
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#";
        }
    }
    public String[] anotherSolution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}