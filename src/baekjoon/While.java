package baekjoon;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if(a == 0 && b == 0) {
//                break;
//            }
//            System.out.println(a+b);
//        }

        //테스트 케이스 개수가 주어지지 않았을 때 어떻게 해결하는가에 관한 문제
        //EOF(End Of File)이라 해서 더이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료할 수 있도록 만들어야 했다.
        //그래서 Scanner를 이용할 땐 hasNextInt()를 이용해서 정수값을 입력 받지 못하면 오류 나는 것 없이 종료가 될 수 있도록 만들었다.
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a+b);
//        }
        
        
        //조건식을 true로 사용하지 않으려고 이렇게 했는데 그냥 true로 했다가 tmp랑 c랑 값이 같았을 때 break를 걸었어도 됐을것 같다
        //tmp에 -1을 준 이유는 0으로 두면 입력값을 0을 넣었을 때 while문이 돌지 않기때문에 넣었다
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int tmp = -1;
        int count = 0;
        while(c != tmp) {
            if(count == 0) {
                tmp = c;
            }
            c = ((c % 10) * 10) + (((c / 10) + (c % 10)) % 10);
            count++;
        }
        System.out.println(count);





    }


}
