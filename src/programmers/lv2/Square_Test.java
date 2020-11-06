package programmers.lv2;

public class Square_Test {
    //멀쩡한 사각형
    //규칙 찾다가 결국 못찾아서 검색 후 해결..
    public long solution(int w, int h) {
        long beforeW = (long)w;
        long beforeH = (long)h;
        long cnt = beforeH*beforeW;
        long val = 0;
        for(int i=w; i>=1; i--) {
            if(w%i == 0 && h%i ==0) {
                val = i;
                break;
            }
        }
        long newW = beforeW/val;
        long newH = beforeH/val;
        return cnt - ((newW+newH - 1)*val);
    }
}
