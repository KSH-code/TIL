import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/13700
 * BOJ 백준온라인져지 13700 완전 범죄 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N, S, D, F, B, K
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int S = Integer.parseInt(str1[1]) - 1;
        int D = Integer.parseInt(str1[2]) - 1;
        int F = Integer.parseInt(str1[3]);
        int B = Integer.parseInt(str1[4]);
        int K = Integer.parseInt(str1[5]);
        int map[] = new int[N];
        try {
            String str2[] = br.readLine().split(" ");
            for (int i = 0; i < K; i++) map[Integer.parseInt(str2[i]) - 1] = 1;
        } catch (Exception e) {}
        Queue<Integer> q = new LinkedList<>();
        int step[] = new int[N];
        for (int i = 0; i < N; i++) step[i] = -1;
        step[S] = 0;
        q.offer(S);
        while (!q.isEmpty()) {
            int x = q.poll();
            int l = x - B;
            int r = x + F;
            if (x == D) {
                System.out.println(step[x]);
                return;
            }
            if (l >= 0 && map[l] == 0 && step[l] == -1) {
                step[l] = step[x] + 1;
                q.offer(l);
            }
            if (r < N && map[r] == 0 && step[r] == -1) {
                step[r] = step[x] + 1;
                q.offer(r);
            }
        }
        bw.write("BUG FOUND");
        bw.flush();
    }
}