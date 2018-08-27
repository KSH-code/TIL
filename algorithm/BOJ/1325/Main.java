import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1325
 * BOJ 백준온라인져지 1325 효율적인 해킹 풀이
 */
public class Main {
    private static int cnt[] = new int[10001], N, M;
    private static ArrayList<Integer> edges[] = new ArrayList[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= 10000; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            edges[s].add(e);
        }
        for (int i = 1; i <= N; i++) {
            cnt[i] = dfs(i, new boolean[N + 1]);
        }
        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (max < cnt[i]) max = cnt[i];
        }
        for (int i = 1; i <= N; i++) {
            if (cnt[i] == max) {
                bw.write(String.valueOf(i));
                bw.write(" ");
            }
        }
        bw.flush();
    }
    private static int dfs (int s, boolean isVisited[]) {
        if (isVisited[s]) return 0;
        isVisited[s] = true;
        int c = 1;
        for (int i = 0; i < edges[s].size(); i++) {
            c += dfs(edges[s].get(i), isVisited);
        }
        return c;
    }
}