package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test_18352 {
    //18352번
    //BFS 문제
    //설계를 하고 코딩을 치자
    //큐에 계속해서 값을 집어넣는 바람에 메모리 초과가 발생했었다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<N+1; i++) {
            list.add(new ArrayList<Integer>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list.get(A).add(B);
        }

        Queue<City> que = new LinkedList<City>();
        int[] disArr = new int[N+1];
        que.add(new City(X, 0));
        while(!que.isEmpty()) {
            City tmpCity = que.poll();
            int nowDis = disArr[tmpCity.cityNo];
            List<Integer> tmpList = list.get(tmpCity.cityNo);
            for(int i = 0; i<tmpList.size(); i++) {
                int cityNo = tmpList.get(i);
                int nextDis = nowDis+1;

                if(disArr[cityNo] != 0 && nextDis >= disArr[cityNo]) continue;
                que.add(new City(cityNo, nextDis));
                disArr[cityNo] = nextDis;
            }
        }
        StringBuilder sb =new StringBuilder();
        for(int i=1; i<N+1; i++) {
            if(disArr[i] == K) {
                sb.append(i+"\n");
            }
        }
        if(sb.length() == 0) {
            sb.append(-1);
        }
        System.out.println(sb.toString());
    }
}

class City {
    int cityNo;
    int distance;
    City(int cityNo, int distance) {
        this.cityNo = cityNo;
        this.distance = distance;
    }
}


