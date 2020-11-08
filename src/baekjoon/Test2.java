package baekjoon;

import javax.annotation.PostConstruct;
import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        
        //1번
//        String[] grades = {"B+","A0","C+"};
//        int[] weights = {6,7,8};
//        int threshold = 200;
//
//        int score = 0;
//        for(int i=0; i< grades.length; i++) {
//            int tmp = 0;
//            switch (grades[i]) {
//                case "A+" : tmp = 10; break;
//                case "A0" : tmp = 9; break;
//                case "B+" : tmp = 8; break;
//                case "B0" : tmp = 7; break;
//                case "C+" : tmp = 6; break;
//                case "C0" : tmp = 5; break;
//                case "D+" : tmp = 4; break;
//                case "D0" : tmp = 3; break;
//                default:  tmp = 0; break;
//            }
//            score += tmp * weights[i];
//        }
//
//        System.out.println(score-threshold);

        
        //2번
//        String s = "9999999999";
//        String op = "*";
//
//        int len = s.length();
//        long[] answer = new long[len-1];
//        for(int i=1; i<len; i++) {
//            long left = Long.parseLong(s.substring(0,i));
//            long right = Long.parseLong(s.substring(i,len));
//
//            if(op.equals("+")) {
//                answer[i-1] = left+right;
//            }else if(op.equals("-")) {
//                answer[i-1] = left-right;
//            }else {
//                answer[i-1] = left*right;
//            }
//        }
//        for(Long l : answer) {
//            System.out.println(l);
//        }

        
        //3번
//        int money = 100000;
//        String[] expected = {"H", "H", "H", "T", "H","H", "H", "H", "T", "H"};
//        String[] actual = {"T", "T", "T", "H", "T","H", "H", "H", "T", "H"};
//        int len = expected.length;
//
//        int bettingMoney = 100;
//        for(int i=0; i<len; i++) {
//            if(expected[i].equals(actual[i])) {
//                money += bettingMoney;
//                bettingMoney = 100;
//            }else {
//                money -= bettingMoney;
//                if (money <= 0) {
//                    break;
//                }
//                if(bettingMoney*2 > money) {
//                    bettingMoney = money;
//                }else {
//                    bettingMoney *= 2;
//                }
//            }
//            System.out.println(money + "/" + bettingMoney);
//        }
//
//        System.out.println(money);







        //5번
//        String penter = "1";
//        String pexit = "11";
//        String pescape = "00";
//        String data = "1";
//
//        int penterLen = penter.length();
//        int len = data.length()/penterLen;
//        String[] dataArr = new String[len];
//        for(int i=0; i<len; i++) {
//            dataArr[i] = data.substring(penterLen*i, penterLen*(i+1));
//        }
//        String answer = penter;
//        for(int i=0; i<len; i++) {
//            if(dataArr[i].equals(penter) || dataArr[i].equals(pexit)
//            || dataArr[i].equals(pescape)) {
//                answer += pescape + dataArr[i];
//            }else {
//                answer += dataArr[i];
//            }
//        }
//        answer += pexit;
//        System.out.println(answer);

        
        //6번
//        String[] logs = {"1901 10 50", "1909 10 50"};
//
//        List<Student> list = new ArrayList<>();
//        for(int i=0; i<logs.length; i++) {
//            String[] tmpLog = logs[i].split(" ");
//            String studentNo = tmpLog[0];
//            String questionNo = tmpLog[1];
//            String questionScore = tmpLog[2];
//            if(list.size() == 0) {
//                list.add(new Student(studentNo, questionNo, questionScore));
//            }
//
//            boolean check = false;
//            for(int j=0; j<list.size(); j++) {
//                if(list.get(j).studentNo.equals(studentNo)) {
//                    list.get(j).map.put(questionNo, questionScore);
//                    check = true;
//                }
//            }
//            if(!check) list.add(new Student(studentNo, questionNo, questionScore));
//        }
//
//        for(Student s : list) {
//            System.out.println(s.studentNo + "/" + s.map.toString());
//        }
//
//        Set<String> setAnswer = new HashSet<>();
//
//        for(int i = 0; i<list.size(); i++) {
//            Student nowStudent = list.get(i);
//            for(int j=i+1; j<list.size(); j++) {
//                Student nextStudent = list.get(j);
//                int questionCheck = 0;
//                if(nowStudent.map.size() == nextStudent.map.size() && nowStudent.map.size() >= 5) {
//                    for(String key : nowStudent.map.keySet()) {
//                        if(nextStudent.map.containsKey(key)
//                                && nextStudent.map.get(key).equals(nowStudent.map.get(key))) {
//                            questionCheck++;
//
//                        }
//
//                    }
//                }
//                if(questionCheck == nowStudent.map.size()) {
//                    setAnswer.add(nowStudent.studentNo);
//                    setAnswer.add(nextStudent.studentNo);
//                }
//            }
//
//        }
//
//        String[] answer = (String[]) setAnswer.toArray(new String[setAnswer.size()]);
//        Arrays.sort(answer);
//        if(answer.length == 0) {
//            answer = new String[1];
//            answer[0] = "None";
//        }
//
//        for(String s : answer) {
//            System.out.println(s);
//        }

        
        //7번
        int n = 1;
        boolean horizontal = false;
        int[][] map = new int[n][n];

        int index = 1;
        int time = 1;
        while (index <= (n-1)*2) {
            for(int i=0; i<=index; i++) {
                for(int j=index; j>=0; j--) {
                    if(i+j == index && i < n && j < n) {
                        int tmpI = i;
                        int tmpJ = j;
                        if(!horizontal) {
                            tmpI = j;
                            tmpJ = i;
                        }

                        if(index % 2 != 0) {
                            map[tmpI][tmpJ] = time;
                        }else{
                            map[tmpJ][tmpI] = time;
                        }

                        time += 2;
                    }
                }
            }
            index++;
            time--;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        //4번
//        int[][] board= {{11,9,8,12},{2,15,4,14},{1,10,16,3},{13,7,5,6}};
//        int n = 4;
//        int beforeX = 0;
//        int beforeY = 0;
//        int num = 1;
//        int answer = 0;
//        while (num <= n*n) {
//            for(int i=0; i<n; i++) {
//                for(int j=0; j<n; j++) {
//                    if(board[i][j] == num) {
//                        int upDown = Math.abs(beforeX-i);
//                       answer += upDown > n-upDown ? n-upDown : upDown;
//                       int leftRight = Math.abs(beforeY - j);
//                       answer += leftRight> n-leftRight ? n-leftRight : leftRight;
//                       beforeX = i;
//                       beforeY = j;
//                       break;
//                    }
//                }
//            }
//            answer++;
//            num++;
//        }
//        System.out.println(answer);







    }

    static class Point {
        int x;
        int y;
        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }



    static class Student {
        String studentNo;
        String questionNo;
        String questionScore;
        HashMap<String, String> map;
        Student (String studentNo, String questionNo, String questionScore) {
            this.studentNo = studentNo;
            map = new HashMap<>();
            map.put(questionNo, questionScore);
        }
    }
}
