package programmers.lv2;


import java.util.HashSet;
import java.util.Set;

public class PrimeNum_Test2 {
    //소수 찾기
    //완전탐색 문제
    //문제를 이해하는데는 전혀 어렵지 않았으나 구현하는게 어려웠다.
    //더군다나 순열을 구현해본 적은 처음이라 검색 후 해결했다..

    public int solution(String numbers) {
        int[] numArr = new int[numbers.length()];
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        Set<Integer> set = new HashSet<>();

        for(int i=1; i<= numArr.length; i++) {
            permutation(numArr, 0, i, set);
        }

        return set.size();
    }

    static void permutation(int[] arr, int depth, int n, Set<Integer> set) {
        if(depth == n) {
            print(arr, n, set);
            return;
        }else {
            for(int i=depth; i<arr.length; i++) {
                swap(arr, i, depth);
                permutation(arr, depth+1, n, set);
                swap(arr, i, depth);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void print(int[] arr, int n, Set<Integer> set) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(arr[i]);
        }

        checkPrimeNum(sb, set);

    }

    static void checkPrimeNum(StringBuilder sb, Set<Integer> set) {
        int num = Integer.parseInt(sb.toString());

        boolean check = true;

        if(num <= 1) return;
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println(num);
            set.add(num);
        }

    }
}
