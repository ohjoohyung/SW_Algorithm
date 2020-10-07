package baekjoon;

import java.util.Scanner;

public class PCroom {
    public static void main(String_Test[] args) {
        //1~100번까지 pc이므로 101까지 만들어야 100번이 들어감
        //범위 잘 생각하자
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //boolean으로 생각
        int[] pc = new int[101];
        int count = 0;
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (pc[n] == n) {
                count++;
                continue;
            }
            pc[n] = n;
        }
        System.out.println(count);
    }
}
