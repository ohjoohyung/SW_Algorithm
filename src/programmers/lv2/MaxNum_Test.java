package programmers.lv2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class MaxNum_Test {
    //수식 최대화
    //링크드리스트로 해결했다.
    //반복문을 많이 사용하고 리스트의 remove를 사용해서 시간초과가 뜨려나라고 생각했지만
    //expression의 길이도 길지않고 링크드리스트를 사용해서 그런지 전혀 문제없이 해결
    public long solution(String expression) {
        List<String> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        String[][] arr = {{"*","+","-"},{"*","-","+"},{"+","*","-"},{"+","-","*"},{"-","+","*"},{"-","*","+"}};
        long max = Integer.MIN_VALUE;
        for(int i = 0; i<6; i++) {
            long tmpVal = method(list, arr, i);
            max = Math.max(max, Math.abs(tmpVal));
        }
        return max;
    }
    static long method(List<String> list, String[][] arr, int i) {
        List<String> tmpList = new LinkedList<>();
        for(int m = 0; m < list.size(); m++) {
            tmpList.add(list.get(m));
        }
        for(int j=0; j<3; j++) {
            for (int k=0; k<tmpList.size(); k++) {
                if(arr[i][j].equals(tmpList.get(k))) {
                    calculate(arr[i][j], tmpList, k);
                    k--;
                }
            }
        }
        return Long.parseLong(tmpList.get(0));
    }

    static void calculate(String oper, List<String> list, int k) {
        long before = Long.parseLong(list.get(k-1));
        long after = Long.parseLong(list.get(k+1));
        long tmp;
        if(oper.equals("*")) {
            tmp = before * after;
        }else if(oper.equals("-")) {
            tmp = before - after;
        }else {
            tmp = before + after;
        }
        list.add(k-1, String.valueOf(tmp));
        for(int l=0; l<3; l++) {
            list.remove(k);
        }
    }
}

