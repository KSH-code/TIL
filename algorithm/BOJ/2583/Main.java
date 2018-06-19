import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2583
 * BOJ 백준온라인져지 2583 영역 구하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static PriorityQueue<Integer> result = new PriorityQueue<>();
    private static int N, M;
    private static boolean map[][], visited[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    map[k][j] = true;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!map[i][j] && !visited[i][j]) result.offer(dfs(i, j));
            }
        }
        bw.write(String.valueOf(result.size()));
        bw.write("\n");
        while (!result.isEmpty()) {
            bw.write(String.valueOf(result.poll()));
            bw.write(" ");
        }
        bw.flush();
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    private static int dfs (int x, int y) {
        visited[x][y] = true;
        int result = 1;
        for (int i = 0; i < 4; i++) {
            int curX = x + xxxx[i];
            int curY = y + yyyy[i];
            if (curX < 0 || curY < 0 || curX >= N || curY >= M || visited[curX][curY] || map[curX][curY]) continue;
            result += dfs(curX, curY);
        }
        return result;
    }
}
