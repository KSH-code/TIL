import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1937
 * BOJ 백준온라인져지 1937 욕심쟁이 판다 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int map[][];
    private static int dp[][];
    private static int xxxx[] = { 0, 1, 0, -1 };
    private static int yyyy[] = { -1, 0, 1, 0 };
    private static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < N; j++) map[i][j] = Integer.parseInt(str1[j]);
        }
        int maxResult = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) maxResult = Math.max(bruteforce(i, j), maxResult);
        }
        bw.write(String.valueOf(maxResult));
        bw.flush();
    }
    private static int bruteforce (int x, int y) {
        if (dp[x][y] > 0) return dp[x][y];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int curX = x + xxxx[i];
            int curY = y + yyyy[i];
            if (curX < 0 || curY < 0 || curX >= N || curY >= N || map[x][y] >= map[curX][curY]) continue;
            max = Math.max(bruteforce(curX, curY), max);
        }
        return dp[x][y] += max + 1;
    }
}