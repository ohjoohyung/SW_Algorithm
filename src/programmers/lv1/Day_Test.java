package programmers.lv1;

public class Day_Test {
        //이런식으로 swith문 이용해서 풀었는데 나도 하면서 좀 지저분한 느낌을 받았다..
        public String solution(int a, int b) {
            String answer = "";
            int sum = 0;
            for (int i = 1; i < a; i++) {
                switch (i) {
                    case 2:
                        sum += 29;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        sum += 30;
                        break;
                    default:
                        sum += 31;
                        break;
                }
            }
            sum += b - 1;
            switch (sum % 7) {
                case 1:
                    answer = "SAT";
                    break;
                case 2:
                    answer = "SUN";
                    break;
                case 3:
                    answer = "MON";
                    break;
                case 4:
                    answer = "TUE";
                    break;
                case 5:
                    answer = "WED";
                    break;
                case 6:
                    answer = "THU";
                    break;
                default:
                    answer = "FRI";
                    break;
            }
            return answer;
        }

        //그래서 다른 사람걸 보니까 이런식으로 배열로 깔끔하게 정리해놓았다
        //코드가 길어지면 배열로 정리하는 생각.. 해야겠다
        public String anotherSolution(int a, int b) {
            String answer = "";

            int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
            String[] MM ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int Adate = 0;
            for(int i = 0 ; i< a-1; i++){
                Adate += c[i];
            }
            Adate += b-1;
            answer = MM[Adate %7];

            return answer;
        }

    }


