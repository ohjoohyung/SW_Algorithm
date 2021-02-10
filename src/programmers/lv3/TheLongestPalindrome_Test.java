package programmers.lv3;

public class TheLongestPalindrome_Test {
    //가장 긴 팰린드롬
    //풀다가 결국 실패..
    //검색 후 해결했다. https://doflamingo.tistory.com/18
    //공책에다 적으면서 푼게 아니라 그냥 풀다보니 머리가 돌아가지 않았다
    //집중하자..
    public int solution(String s)
    {
        int answer = 1;
        for(int i = 0; i< s.length()-1; i++) {
            int oddSol = oddSolution(i, s.length(), s);
            int evenSol = evenSolution(i, s.length(), s);
            if(answer < oddSol)
                answer = oddSol;
            if(answer < evenSol)
                answer = evenSol;

        }
        return answer;
    }


//        int answer = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int index = i;
//            int endIndex = s.length() - 1;
//            char now = s.charAt(index);
//            char end = s.charAt(endIndex);
//            int length = 0;
//            while (index <= endIndex && index < s.length() - 1 && endIndex > 0) {
//                if (now == end) {
//                    System.out.println(now + "/" + end);
//                    if (index == endIndex) {
//                        length += 1;
//                    } else {
//                        length += 2;
//                    }
//                    System.out.println(index + "/" + endIndex);
//                    now = s.charAt(++index);
//                }
//                end = s.charAt(--endIndex);
//            }
//            System.out.println(length);
//
//            if (length == s.length()) {
//                answer = length;
//                break;
//            } else {
//                answer = Math.max(answer, length);
//            }
//        }
//        System.out.println(answer);

    public static int oddSolution(int pos, int length, String s) {
        int maxCount = 1;
        for (int i = 1; i <= length / 2; i++) {
            if (pos - i < 0 || pos + i >= length) {
                break;
            }
            if (s.charAt(pos - i) == s.charAt(pos + i)) {
                maxCount += 2;
            }else {
                break;
            }
        }
        return maxCount;
    }

    public static int evenSolution(int pos, int length, String s) {
        int maxCount = 0;
        if (s.charAt(pos) == s.charAt(pos + 1)) {
            maxCount = 2;
            for (int i = 1; i <= length / 2; i++) {
                if (pos - i < 0 || pos + 1 + i >= length) {
                    break;
                }
                if (s.charAt(pos - i) == s.charAt(pos + 1 + i)) {
                    maxCount += 2;
                }else {
                    break;
                }
            }
        }
        return maxCount;
    }
}
