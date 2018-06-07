import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1012
 * BOJ 백준온라인져지 1012 유기농 배추 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static boolean map[][];
    private static boolean isVisited[][];
    private static int N = 0;
    private static int M = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new boolean[N][M];
            isVisited = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                map[x][y] = true;
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (dfs(i, j)) result++;
                }
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    private static boolean dfs (int x, int y) {
        if (isVisited[x][y] || !map[x][y]) return false;
        map[x][y] = false;
        isVisited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + xxxx[i];
            int nextY = y + yyyy[i];
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
            dfs(nextX, nextY);
        }
        return true;
    }
}