import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10971
 * BOJ 백준온라인져지 10971 외판원 순회 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int edges[][], N;
    private static boolean isVisited[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        isVisited = new boolean[N];
        edges = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                edges[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bw.write(String.valueOf(dfs(0)));
        bw.flush();
    }
    private static int dfs (int x) {
        boolean allVisited = true;
        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                allVisited = false;
                break;
            }
        }
        if (allVisited && x == 0) return 0;
        int result = 987654321;
        for (int i = 0; i < N; i++) {
            if (isVisited[i] || edges[x][i] == 0) continue;
            isVisited[i] = true;
            result = Math.min(result, edges[x][i] + dfs(i));
            isVisited[i] = false;
        }
        return result;
    }
}