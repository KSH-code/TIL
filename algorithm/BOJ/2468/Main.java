import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2468
 * BOJ 백준온라인져지 2468 안전 영역 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int tempMap[][];
    private static boolean visited[][];
    private static int N;
    private static int z;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];
        int max = 1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                max = Math.max(max, map[i][j] = Integer.parseInt(st.nextToken()));
            }
        }
        int result = 1;
        for (z = 1; z <= max; z++) {
            tempMap = new int[N][N];
            visited = new boolean[N][N];
            int tempResult = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tempMap[i][j] = map[i][j];
                    if (tempMap[i][j] <= z) visited[i][j] = true;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && tempMap[i][j] > z) {
                        tempResult++;
                        dfs(i, j);
                    }
                }
            }
            result = Math.max(result, tempResult);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    private static void dfs (int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int curX = x + xxxx[i];
            int curY = y + yyyy[i];
            if (curX < 0 || curY < 0 || curX >= N || curY >= N || visited[curX][curY]) continue;
            dfs(curX, curY);
        }
    }
}
