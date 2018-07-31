import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1652
 * BOJ 백준온라인져지 1652 누울 자리를 찾아라 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static boolean map[][], isVisited[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) == '.';
            }
        }
        int result[] = new int[2];
        for (int i = 0; i < 2; i++) {
            isVisited = new boolean[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (dfs(j, k, i) > 1) result[i]++;
                }
            }
        }
        bw.write(result[0] + " " + result[1]);
        bw.flush();
    }
    private static int dfs (int x, int y, int isUpDown) {
        if (x < 0 || x >= N || y < 0 || y >= N || !map[x][y] || isVisited[x][y]) return 0;
        isVisited[x][y] = true;
        if (isUpDown == 1) {
            return dfs(x - 1, y, isUpDown) + dfs(x + 1, y, isUpDown) + 1;
        }
        return dfs(x, y + 1, isUpDown) + dfs(x, y - 1, isUpDown) + 1;
    }
}