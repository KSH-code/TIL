import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2188
 * BOJ 백준온라인져지 2188 축사 배정 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M, room[];
    private static boolean edges[][], visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges = new boolean[N + 1][M + 1];
        room = new int[M + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                edges[i + 1][Integer.parseInt(st.nextToken())] = true;
            }
        }
        int result = 0;
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            if (dfs(i)) result++;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static boolean dfs (int x) {
        if (visited[x]) return false;
        visited[x] = true;
        for (int i = 1; i <= M; i++) {
            if (edges[x][i])
                if (room[i] == 0 || dfs(room[i])) {
                    room[i] = x;
                    return true;
                }
        }
        return false;
    }
}