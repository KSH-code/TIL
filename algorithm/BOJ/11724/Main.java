import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11724
 * BOJ 백준온라인져지 11724 연결 요소의 개수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M;
    private static boolean visited[], edges[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges = new boolean[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            edges[s][e] = edges[e][s] = true;
        }
        visited = new boolean[N + 1];
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                result++;
                dfs(i);
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void dfs (int x) {
        visited[x] = true;
        for (int i = 1; i <= N; i++) {
            if (!edges[x][i] || visited[i]) continue;
            dfs(i);
        }
    }
}
