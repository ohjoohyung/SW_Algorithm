package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics {
    public static void main(String[] args) throws IOException {
        //1712번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sArr = s.split(" ");
        long n = 0;
        if((Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) <= 0) {
            n = -1;
        }else{
            n = Long.parseLong(sArr[0]) / (Long.parseLong(sArr[2])-Long.parseLong(sArr[1])) + 1;
        }
        System.out.println(n);


        //5073번
//        while(true) {
//            String s = br.readLine();
//            if(s.startsWith("0")) break;
//            String[] arr = s.split(" ");
//            int[] iArr = new int[3];
//            for(int i = 0; i<3; i++) {
//                iArr[i] = Integer.parseInt(arr[i]);
//            }
//            Arrays.sort(iArr);
//            int n1 = iArr[0];
//            int n2 = iArr[1];
//            int n3 = iArr[2];
//            if(n1 == n2 && n2 == n3) {
//                System.out.println("Equilateral");
//                continue;
//            }else if(n3 < n1 + n2) {
//                if(n1 == n2 || n2 == n3 || n3 == n1) {
//                    System.out.println("Isosceles");
//                }else {
//                    System.out.println("Scalene");
//                }
//            }else {
//                System.out.println("Invalid");
//            }
//        }

    }
}
