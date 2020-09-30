package baekjoon;

public class Function {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Function.sum(a));
    }
    static long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
