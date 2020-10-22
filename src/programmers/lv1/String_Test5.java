package programmers.lv1;

import java.util.Arrays;
import java.util.Comparator;



public class String_Test5 {
    //문자열 내마음대로 정렬하기 다시 해보자 -> 다시 해봄
    //Arrays.sort 이용해서 풀었다
    //문자가 같으면 문자열을 비교하고 다르면 문자를 비교한 값을 리턴하도록 만듬
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = String.valueOf(o1.charAt(n));
                String s2 = String.valueOf(o2.charAt(n));
                if (s1.equals(s2)) {
                    return o1.compareTo(o2);
                }
                return s1.compareTo(s2);
            }
        });
        return strings;
    }

    //문자열 앞에 문자를 붙여서 정렬시키는 기발한 풀이법
//    public String[] anotherSolution(String[] strings, int n) {
//        String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;
//    }
}

//        int n = 2;
//        String tmp = "";
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 1; j < arr.length - i; j++) {
//                if(arr[j-1].charAt(n) > arr[j].charAt(n)) {
//                    tmp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = tmp;
//                }else if(arr[j-1].charAt(n) == arr[j].charAt(n)) {
//                    int small = arr[j-1].length() >= arr[j].length() ? arr[j].length() : arr[j-1].length();
//                    for(int k = 0; k < small; k++) {
//                        if((arr[j-1].charAt(k) > arr[j].charAt(k)) || (k == small - 1 && arr[j-1].length() > arr[j].length())) {
//                            tmp = arr[j-1];
//                            arr[j-1] = arr[j];
//                            arr[j] = tmp;
//                        }else if(arr[j-1].charAt(k) < arr[j].charAt(k)) {
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        for(String s : arr) {
//            System.out.println(s);
//        }

