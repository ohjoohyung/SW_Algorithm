package programmers.lv1;

import java.util.StringJoiner;

//문자열 내마음대로 정렬하기 다시 해보자
public class String_Test5 {
    public static void main(String[] args) {
        String[] arr = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
        int n = 2;
        String tmp = "";
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j-1].charAt(n) > arr[j].charAt(n)) {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }else if(arr[j-1].charAt(n) == arr[j].charAt(n)) {
                    int small = arr[j-1].length() >= arr[j].length() ? arr[j].length() : arr[j-1].length();
                    for(int k = 0; k < small; k++) {
                        if((arr[j-1].charAt(k) > arr[j].charAt(k)) || (k == small - 1 && arr[j-1].length() > arr[j].length())) {
                            tmp = arr[j-1];
                            arr[j-1] = arr[j];
                            arr[j] = tmp;
                        }else if(arr[j-1].charAt(k) < arr[j].charAt(k)) {
                            break;
                        }
                    }
                }
            }
        }
        for(String s : arr) {
            System.out.println(s);
        }

    }
}
