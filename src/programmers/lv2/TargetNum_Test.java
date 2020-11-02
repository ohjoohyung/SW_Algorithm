package programmers.lv2;

public class TargetNum_Test {
    //타겟넘버
    //생각보다 쉬운 문제인데 너무 어렵게 생각했던 거 같다.
    //접근 방법은 맞았지만 구현을 어떻게 할지 헷갈려서 검색해서 참고함..
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return answer;
    }

    static void dfs(int index, int[] numbers, int target, int sum) {
        if(index < numbers.length) {
            dfs(index+1, numbers, target,sum + numbers[index]*1);
            dfs(index+1, numbers, target, sum + numbers[index]*(-1));
        }else {
            if(target == sum) {
                answer++;
            }
        }
    }
}
