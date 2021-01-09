package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test_17298 {
    public static void main(String[] args) throws IOException {
        //오큰수
        //이중 for 문이나 스택을 이용해 두번 반복문 돌리는거나 O(n2)이라 똑같이 시간초과 뜨는거 아닌가 싶었는데
        //이런식으로 비교할 i번째 배열보다 낮은 값들은 스택에서 pop을 해주어 시간을 줄일 수가 있다.
        //어차피 현재 i번째 배열보다 낮은 스택 값은 다음 i번째 배열과 비교할 때도 당연히 낮을 것이니 이 방법이 사용이 가능하다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int[] answer = new int[n];
        for (int i = n-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) { // = 을 꼭 붙여야함. 같은 값이 나올 수도 있으니
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            }else {
                answer[i] = stack.peek();
            }
            stack.push(numbers[i]);
        }
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]+" "); //맨 마지막 문자 뒤에 공백이 와도 답으로 인정하는듯. 처음 알았다..
        }
        System.out.println(sb.toString());


        //스택을 사용하지 않고 풀어봤지만 역시나 시간복잡도가 O(n2)이기 때문에 시간초과
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i ++) {
//            boolean check = false;
//            for (int j = i+1; j < n; j++) {
//                if (numbers[i] < numbers[j]) {
//                    check = true;
//                    sb.append(numbers[j]+" ");
//                    break;
//                }
//            }
//            if (!check) sb.append(-1+" ");
//        }
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb.toString());
    }
}
