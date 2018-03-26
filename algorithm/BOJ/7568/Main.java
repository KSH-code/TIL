import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7568
 * BOJ 백준온라인져지 7568 덩치 풀이
 */
public class Main {
    static class Person {
        public int w, h;
        public Person(int w, int h) {
            this.w = w;
            this.h = h;
        }
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Person list[] = new Person[N];
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            int w = Integer.parseInt(str1[0]);
            int h = Integer.parseInt(str1[1]);
            list[i] = new Person(w, h);
        }
        int result[] = new int[N];
        for (int i = 0; i < N; i++) {
            int gt = 1;
            for (int j = 0; j < N; j++) {
                if (list[i].w < list[j].w && list[i].h < list[j].h) gt++;
            }
            result[i] = gt;
        }
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}