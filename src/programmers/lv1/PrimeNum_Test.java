package programmers.lv1;

public class PrimeNum_Test {
    public static void main(String[] args) {

        //시간 초과
//        int n = 10;
//        if(n == 2) {
//            System.out.println(1);
//        }
//        int count = 0;
//        for(int i = 3; i <= n; i++) {
//            for(int j = 2; j <= i-1; j++) {
//                if(i % j == 0) {
//                    break;
//                }else {
//                    if(j == i-1) {
//                        count++;
//                    }
//                }
//            }
//        }
        

    }
    
    //에라토스테네스의 체 사용
    //2의 배수부터 시작해서 배수를 전부 지워나감
    //n까지 for문을 돌려도 되지만 루트를 씌운 값보다 큰 값의 배수는 따지지 않아도 무방하기에
    //i*i <= n 으로 두었다
    //검색해서 해결함ㅜㅜ
    public int solution(int n) {
        int[] arr = new int[n+1];
        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for(int i = 2; i*i <= n; i++) {
            if(arr[i] == 0) {
                continue;
            }
            for(int j = 2*i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(arr[i] != 0) {
                count++;
            }
        }
        return count;

    }
}
