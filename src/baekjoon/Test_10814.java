package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        User[] arr = new User[N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        //같으면 0이 리턴되도록 만들어 주는 것이 중요
        Comparator<User> com = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.age > o2.age) {
                    return 1;
                }else if(o1.age == o2.age) {
                    return 0;
                }

                return -1;
            }
        };
        Arrays.sort(arr, com);
        for(User u : arr) {
            bw.append(u.age + " " + u.name + "\n");
        }
        bw.flush();
        bw.close();
    }


}

class User {
    int age;
    String name;
    User (int age, String name) {
        this.age = age;
        this.name = name;
    }
}
