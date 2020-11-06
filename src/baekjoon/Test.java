package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {
    static int cnt = 0;
    public static void main(String[] args) {
//       String s = "110010101001";
//       int totalCnt = 0, len, zeroCnt, num = 1;
//       String tmpS = "";
//       int[] answer = new int[2];
//
//        while (true) {
//            tmpS = s.replace("0", "");
//            len = tmpS.length();
//            zeroCnt = s.length() - len;
//            totalCnt += zeroCnt;
//            s = Integer.toBinaryString(len);
//            if(s.equals("1")) break;
//            num++;
//
//        }
//        answer[0] = num;
//        answer[1] = totalCnt;
//        System.out.println(num+"/"+totalCnt);

//        int[] a = {0,3,3,0,7,2,0,2,2,0};
//        int n = a.length;
//        boolean[] visited = new boolean[n];
//
//        for(int i=4; i <= n; i +=2) {
//            combination(a, visited, 0, n, i);
//        }
//
//
//
//    }
//    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
//        if(r == 0) {
//            print(arr,visited,n);
//            return;
//        }else {
//            for(int i = start; i < n; i++) {
//                visited[i] = true;
//                combination(arr, visited, i+1, n, r-1);
//                visited[i] = false;
//            }
//        }
//    }
//
//    static void print(int[] arr, boolean[] visited, int n) {
//        for(int i=0; i<n; i++) {
//            if(visited[i]) {
//                System.out.print(arr[i] +" ");
//            }
//        }
//        System.out.println();
//    }


//        int t[][] = {{5,1},{2,5},{3,5},{3,6},{2,4},{4,0}};
//        //int t[][] = {{2,5},{2,0},{3,2},{4,2},{2,1}};
//        int[] visited = new int[t.length+1];
//
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0; i<t.length+1; i++) {
//            list.add(new ArrayList<>());
//        }
//        for(int i=0; i<t.length; i++) {
//            list.get(t[i][0]).add(t[i][1]);
//            list.get(t[i][1]).add(t[i][0]);
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//        int[] tmpArr;
//
//        while (!stack.isEmpty()) {
//            int tmp = stack.peek();
//            if(visited[tmp] == 0) {
//                cnt++;
//            }else if(visited[tmp] >= 2) {
//                break;
//            }
//            visited[tmp]++;
//            List<Integer> tmpList = list.get(tmp);
//            for(int i=0; i<tmpList.size(); i++) {
//                int item = tmpList.get(i);
//                if(item >= 1) {
//                    tmpList.remove(item);
//                    tmpList.add(item);
//                }
//            }
//
//            int flag = 0;
//
//            for(int i=0; i<tmpList.size(); i++) {
//                int item = tmpList.get(i);
//                if(visited[item] == 1) {
//                    if(i < tmpList.size()-1) {
//                        int next = tmpList.get(i+1);
//                        if(visited[next] == 0) continue;
//                    }
//                }
//
//                if(visited[item] == 0 || visited[item] == 1) {
//                    System.out.println(item + "/" + cnt);
//                    flag++;
//                    stack.push(item);
//                    break;
//                }
//            }
//            if(flag == 0) stack.pop();
//        }
//
//        System.out.println(cnt);


//        int[] moneyArr = {50000,10000,5000,1000,500,100,50,10,1};
//        int[] answer = new int[moneyArr.length];
//        int money = 1;
//        changeMoney(money, answer, moneyArr);
//        for(int i=0; i< answer.length; i++) {
//            System.out.print(answer[i] +" ");
//        }


//        String word = "I love you";
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<word.length(); i++) {
//            char tmp = word.charAt(i);
//            if(tmp >= 'a' && tmp <= 'z') {
//                tmp = (char)('z'-tmp+'a');
//            }else if(tmp >= 'A' && tmp <= 'Z') {
//                tmp = (char)('Z'-tmp+'A');
//            }
//            sb.append(tmp);
//        }
//        System.out.println(sb.toString());


//        int[] pobi = {99,102};
//        int[] crong = {211,212};
//
//        int pobiMaxScore = 0;
//        int crongMaxScore = 0;
//
//        int result = 0;
//        if(pobi[1]-pobi[0] != 1 || crong[1]-crong[0] != 1) {
//            result = -1;
//        }else {
//            for(int i=0; i<2; i++) {
//                char[] pobiNum = String.valueOf(pobi[i]).toCharArray();
//                char[] crongNum = String.valueOf(crong[i]).toCharArray();
//
//                int plus = 0;
//                int multiply = 1;
//                for(int j=0; j<pobiNum.length; j++) {
//                    plus += pobiNum[j]-'0';
//                    multiply *= pobiNum[j]-'0';
//                }
//                int tmpMaxScore = plus > multiply ? plus : multiply;
//                pobiMaxScore = tmpMaxScore > pobiMaxScore ? tmpMaxScore : pobiMaxScore;
//                plus = 0;
//                multiply = 1;
//
//                for(int j=0; j<crongNum.length; j++) {
//                    plus += crongNum[j]-'0';
//                    multiply *= crongNum[j]-'0';
//                }
//                tmpMaxScore = plus > multiply ? plus : multiply;
//                crongMaxScore = tmpMaxScore > crongMaxScore ? tmpMaxScore : crongMaxScore;
//            }
//
//            result = pobiMaxScore >= crongMaxScore ? (pobiMaxScore == crongMaxScore ? 0 : 1) : 2;
//        }
//
//        System.out.println(result);

//        int number = 1;
//        int result = 0;
//        for(int i=1; i<=number; i++) {
//            int num = i;
//            while (num != 0) {
//                int remainder = num % 10;
//                if(remainder == 3 || remainder == 6 || remainder == 9) {
//                    result++;
//                }
//                num = num / 10;
//            }
//            System.out.println(i + "/" + result);
//        }
//        System.out.println(result);


//        int totalTicket = 1;
//        String[] logs = {"woni request 09:12:29",
//                "brown request 09:23:11",
//                "brown leave 09:23:44",
//                "jason request 09:33:51",
//                "jun request 09:33:56",
//                "cu request 09:34:02"};
//
//        Stack<People> stack = new Stack<>();
//
//        String tmpLog[];
//        String name;
//        String time;
//        for(int i=0; i<logs.length; i++) {
//            tmpLog = logs[i].split(" ");
//            name = tmpLog[0];
//            time = tmpLog[2];
//            if(totalTicket == 0) {
//                break;
//            }
//
//            if(stack.isEmpty()) {
//                stack.add(new People(name,time));
//                totalTicket--;
//            }else {
//                if(name.equals(stack.peek().name) && tmpLog[1].equals("leave")) {
//                    stack.pop();
//                }else {
//                    if(compareTime(stack.peek().time, time)) {
//                        stack.add(new People(name, time));
//                        totalTicket--;
//                    }
//                }
//            }
//        }
//        String[] answer = new String[stack.size()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = stack.pop().name;
//            System.out.println(answer[i]);
//        }
//    }
//
//    static boolean compareTime(String beforeTime, String afterTime) {
//        String[] beforeTimeArr = beforeTime.split(":");
//        String[] afterTimeArr = afterTime.split(":");
//        int beforeTotalTime = Integer.parseInt(beforeTimeArr[0])*3600 + Integer.parseInt(beforeTimeArr[1])*60
//                + Integer.parseInt(beforeTimeArr[2]);
//        int afterTotalTime = Integer.parseInt(afterTimeArr[0])*3600 + Integer.parseInt(afterTimeArr[1])*60
//                + Integer.parseInt(afterTimeArr[2]);
//        if(afterTotalTime - beforeTotalTime > 60) {
//            return true;
//        }
//        return false;
//    }
//
//    static class People {
//        String name;
//        String time;
//        People (String name, String time) {
//            this.name = name;
//            this.time = time;
//        }
//    }


        String cryptogram = "zzzzzzz";

//        while (true) {
//            String tmp = "";
//            for(int i=0; i<cryptogram.length(); i++) {
//                char now = cryptogram.charAt(i);
//                if(i != 0 && i != cryptogram.length()-1) {
//                    if(now != cryptogram.charAt(i-1)
//                        && now != cryptogram.charAt(i+1)) {
//                        tmp += now;
//                    }
//                }else if(i == 0) {
//                    if(now != cryptogram.charAt(i+1)) {
//                        tmp += now;
//                    }
//                }else if(i == cryptogram.length()-1) {
//                    if(now != cryptogram.charAt(i-1)) {
//                        tmp += now;
//                    }
//                }
//            }
//            if(cryptogram.equals(tmp)) {
//                break;
//            }
//            cryptogram = tmp;
//
//        }
//        System.out.println(cryptogram);

        
//        Stack<Character> stack = new Stack<>();
//        stack.add(cryptogram.charAt(0));
//        for(int i=0; i<cryptogram.length(); i++) {
//            char tmp = stack.peek();
//            if(tmp == cryptogram.charAt(i)) {
//                stack.pop();
//            }else {
//                stack.add(cryptogram.charAt(i));
//            }
//        }
//        String result = "";
//        while (!stack.isEmpty()) {
//            result = stack.pop() + result;
//        }
//        System.out.println(result);




//    static void changeMoney(int money, int[] arr, int[] moneyArr) {
//        for(int i=0; i<arr.length; i++) {
//            int quotient = money / moneyArr[i];
//            if(quotient != 0) {
//                arr[i] = quotient;
//            }
//            money = money % moneyArr[i];
//            if(money == 0) break;
//        }
//    }


    }
}