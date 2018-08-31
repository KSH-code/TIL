import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12101
 * BOJ 백준온라인져지 12101 1, 2, 3 더하기 2 풀이
 */
public class Main {
    private static int cnt = 0, N, K;
    private static boolean print = false;
    private static Deque<Integer> q = new ArrayDeque<>();
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        go(0);
        if (!print) bw.write("-1");
        bw.flush();
    }
    private static void go (int a) throws IOException {
        for (int i = 1; i <= 3; i++) {
            if (a + i > N) return;
            q.add(i);
            if (a + i == N) {
                cnt++;
                if (cnt == K) {
                    print = true;
                    while (!q.isEmpty()) {
                        bw.write(String.valueOf(q.pollFirst()));
                        if (!q.isEmpty()) bw.write('+');
                    }
                }
            }
            go(a + i);
            q.pollLast();
        }
    }
}