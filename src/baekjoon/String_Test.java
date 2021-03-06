package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String_Test {
    public static void main(String[] args) throws IOException {
        //백준 11654번
        //System.in.read()로 입력하면 아스키코드 값으로 출력이나옴
        Scanner sc = new Scanner(System.in);
//        System.out.println((int)sc.nextLine().charAt(0));
//        System.out.print(System.in.read());


        //백준 11720번
//        int n = Integer.parseInt(sc.nextLine());
//        String s = sc.nextLine();
//        int sum = 0;
//        for(int i = 0; i < n; i++) {
//            sum += s.charAt(i)-'0';
//        }
//        System.out.println(sum);
        
        //백준 10809번
//        String s = sc.nextLine();
//        int[] arr = new int[26];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = -1;
//        }
//        for(int i = 0; i < s.length(); i++) {
//            for(int j = 0; j < arr.length; j++) {
//                if(s.charAt(i) -'a' == j && arr[j] == -1) {
//                    arr[j] = i;
//                    break;
//                }
//            }
//        }
//        for(int i : arr) {
//            System.out.print(i+" ");
//        }

        //백준 2675번
//        int n = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < n; i++) {
//            String s = sc.nextLine();
//            String answer = "";
//            String[] sArr = s.split(" ");
//            for(int j = 0; j < sArr[1].length(); j++) {
//                for(int l = 0; l < Integer.parseInt(sArr[0]); l++) {
//                    answer += sArr[1].charAt(j);
//                }
//            }
//            System.out.println(answer);
//        }

        //백준 1157번
        //난 HashMap을 이용했지만 이렇게 알파벳 개수를 셀 때 길이가 26인 int 배열을 만들어서 개수를 세도 무방
//        String s = sc.nextLine();
//        s = s.toUpperCase();
//        HashMap<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) {
//            map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)),0)+1);
//        }
//        int max = 0;
//        String answer = "";
//        for(String key : map.keySet()) {
//            if(map.get(key) > max) {
//                max = map.get(key);
//                answer = key;
//            }else if(map.get(key) == max) {
//                answer = "?";
//            }
//        }
//        System.out.println(answer);

        //백준 1152번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        String[] sArr = s.trim().split(" ");
//        if(s.equals(" ")) {
//            System.out.println(0);
//        }else {
//            System.out.println(sArr.length);
//        }

        //백준 2908번
//        String s = br.readLine();
//        String[] sArr = s.split(" ");
//        int max = 0;
//        for(int i = 0; i < sArr.length; i++) {
//            String reverse = "";
//            for(int j = 2; j  >= 0; j--) {
//                reverse += sArr[i].charAt(j);
//            }
//            if(Integer.parseInt(reverse) > max) {
//                max = Integer.parseInt(reverse);
//            }
//        }
//        System.out.println(max);

        //백준 5622번
        //밑에 입력받아서 답 구하는거에서 이중for문을 썼었는데 그렇게 할 필요없이 한번에 해결할 수 있도록 바꾸었다
//        int[] arr = new int[26];
//        int val = 2;
//        for(int i = 0; i < 26; i++) {
//            arr[i] = val;
//            if((i+1) % 3 == 0 && i+1 <= 15) {
//                val++;
//            }else if(i+1 == 19 || i+1 == 22) {
//                val++;
//            }
//        }
//        String s = br.readLine();
//        int answer = 0;
//        for(int i = 0; i < s.length(); i++) {
//            answer += arr[s.charAt(i)-'A']+1;
//        }
//
//        System.out.println(answer);

        //백준 2941번
//        String s = br.readLine();
//        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
//
//        int index = 0;
//        int count = 0;
//        while (index < arr.length) {
//            if(s.contains(arr[index])) {
//                s = s.replaceFirst(arr[index], " ");
//                count++;
//            }else {
//                index++;
//            }
//            System.out.println(index + "/" + s);
//        }
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != ' ') {
//                count++;
//            }
//        }
//        System.out.println(count);

        //백준 1316번
        //이중for문으로 풀었는데 다른 사람 풀이를 보니 크기가 26인 boolean 배열을 만들어서 중복값을 체크하더라
        //그럼 for문을 하나만 써도 됨
        int n = Integer.parseInt(br.readLine());
        int count = 0;
//        boolean check = true;
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
//            char[] cArr = s.toCharArray();
            boolean answer = true;
            boolean[] checkArr = new boolean[26];
            char prev = ' ';
            for(int j = 0; j < s.length(); j++) {
                boolean check = checkArr[s.charAt(j)-'a'];
                if(!check || prev == s.charAt(j)) {
                    checkArr[s.charAt(j)-'a'] = true;
                }else {
                    answer = false;
                    break;
                }
                prev = s.charAt(j);

            }
            if(answer) count++;
//            if(cArr.length != 1) {
//                for(int j = 0; j < cArr.length; j++) {
//                    for(int l = j + 1; l < cArr.length; l++) {
//                        if(cArr[j] == cArr[l] && l-j == 1) {
//                            break;
//                        }else if(cArr[j] == cArr[l] && l-j > 1) {
//                            check = false;
//                            break;
//                        }
//                    }
//                }
//            }
//            if(check) count++;
//            check = true;
        }

        System.out.println(count);



    }
}
