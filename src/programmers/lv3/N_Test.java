package programmers.lv3;

import java.util.HashSet;
import java.util.Set;

public class N_Test {
    //N으로 표현
    //동적계획법 문제
    //어떻게 동적계획법을 사용해서 풀지하고 고민하다 결국 검색해서 해결했다.
    //https://coder9084.tistory.com/70?category=1140888 참고
    //케이스 개수가 적다보니 DFS로 문제를 해결해도 된다.
    static int tempN;
    static Set<Integer>[] arr;
    public int solution(int N, int number) {
        tempN = N;
        arr = new HashSet[10];
        int answer = -1;
        for (int i = 1; i <= 8; i++) {
            Set<Integer> tempSet = getNumbersByUsedCount(i);
            if (tempSet.contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    //N을 사용한 횟수만큼의 수가 있는 Set을 반환
    public Set<Integer> getNumbersByUsedCount(int count) {
        if (arr[count] != null && !arr[count].isEmpty()) {
            return arr[count];
        }

        int numberUsingNandCount = 0; //N이 count 개수만큼 있는 수 (ex N 5, count 3이라면 555)
        for (int i = 0; i < count; i++) {
            numberUsingNandCount = 10*numberUsingNandCount + tempN;
        }

        Set<Integer> tempSet = new HashSet<>();
        tempSet.add(numberUsingNandCount);

        //현재 count가 2라면 N을 1번 사용한 숫자와 N을 이용해 사칙연산을 해준다. 그렇게 되면 count가 2인 set이 완성됨
        //현재 count가 3이라면 N을 2번 사용한 숫자와 N을 1번 사용한 숫자를 이용해 사칙연산을 해준다
        //+ N을 1번 사용한 숫자와 N을 2번 사용한 숫자를 이용해 사칙연산 해줌. (set을 사용한 이유는 중복된 수를 제거하기 위해)
        for (int i = 1; i < count; i++) {
            int j = count - i;
            Set<Integer> from = getNumbersByUsedCount(i);
            Set<Integer> to = getNumbersByUsedCount(j);
            for (int fromNumber : from) {
                for (int toNumber : to) {
                    tempSet.add(fromNumber+toNumber);
                    tempSet.add(fromNumber-toNumber);
                    tempSet.add(fromNumber*toNumber);
                    //0으로 나누면 안되니 이렇게 처리
                    if (toNumber != 0) tempSet.add(fromNumber/toNumber);
                }
            }
        }
        return arr[count] = tempSet;
    }

    //DFS로 문제를 푼 경우
    //https://eoghks0521.tistory.com/entry/N%EC%9C%BC%EB%A1%9C-%ED%91%9C%ED%98%84%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4 참고
//    static int answer = -1;
//
//    public static void solution(int n, int number) {
//        calc(n,number,0,0);
//    }
//    public static void calc(int n, int number, int count,int accum) {
//        int nn = n;
//
//        if(count>8) {
//            answer = -1;
//            return;
//        }
//        if(accum==number) {
//            if(answer == -1 || answer > count) {
//                answer = count;
//            }
//            return ;
//        }
//
//
//        for (int i = 1; i < 9-count; i++) {
//
//            calc(n,number,count+i,accum+nn);
//
//            calc(n,number,count+i,accum-nn);
//
//            calc(n,number,count+i,accum*nn);
//
//            calc(n,number,count+i,accum/nn);
//
//            nn = nn*10 + n;
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int n = 5;
//        int number = 12;
//        solution(n,number);
//        System.out.println(answer);
//    }
}
