package programmers.lv3;

public class Jump_Test {
    //멀리 뛰기
    //칸이 1개일 때 뛸 수 있는 방법 1가지
    //칸이 2개일 때 뛸 수 있는 방법 2가지
    //칸이 3개일 때 뛸 수 있는 방법 = 처음에 1칸 뛰었을 때(칸이 2개일 때 뛸 수 있는 방법) + 처음에 2칸 뛰었을 때(칸이 1개일 때 뛸 수 있는 방법)
    //칸이 n개일 때 뛸 수 있는 방법 = 칸이 n-1개일 때 뛸 수 있는 방법 + 칸이 n-2개일 때 뛸 수 있는 방법
    //개수를 하나씩 구해보고 피보나치 수인지 알았지만 왜 이렇게 나올까 하고 찾아보았다.(https://velog.io/@gowoonsori/cpplongjump 참고)
    public long solution(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;

        return arr[n];
    }
}
