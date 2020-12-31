package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(array[i]+"\n");
        }
        System.out.println(sb.toString());


        //다른 분들이 푼 방법
        //난 카운팅정렬이 아니라 그냥 Arrays.sort를 이용해서 풀었는데 이 문제는 이렇게 푸는게 맞는것 같다.
        //숫자 범위가 10000까지라 정해져있으니 이 숫자를 카운트 하기 위한 배열을 만들고
        //다시 반복문을 이용해 하나씩 빼주며 StringBuilder에 담아주면 된다.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        int []arr = new int[10001];
//        for(int i=0;i<n;i++){
//            arr[Integer.parseInt(br.readLine())]++;
//        }
//        for(int i=0;i<10001;i++){
//            while(arr[i]>0){
//                sb.append(i).append("\n");
//                arr[i]--;
//            }
//        }
//        System.out.println(sb);
    }
}
