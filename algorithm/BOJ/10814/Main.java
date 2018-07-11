import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10814
 * BOJ 백준온라인져지 10814 나이순 정렬 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static class User implements Comparable<User> {
        public int i, age;
        public String name;
        public User (int i, int age, String name) {
            this.i = i;
            this.age = age;
            this.name = name;
        }
        @Override
        public int compareTo (User arg0) {
            if (arg0.age == this.age) return this.i - arg0.i;
            return this.age - arg0.age;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        User users[] = new User[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            users[i] = new User(i, age, st.nextToken());
        }
        Arrays.sort(users);
        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(users[i].age));
            bw.write(" ");
            bw.write(users[i].name);
            bw.write("\n");
        }
        bw.flush();
    }
}
