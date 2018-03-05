import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1520
 * BOJ 백준온라인져지 1520 내리막 길 풀이
 */
public class Main {
    private static int dp[][];
    private static int map[][];
    private static int M, N;
    private static int xxxx[] = {0, -1, 0, 1};
    private static int yyyy[] = {-1, 0, 1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1[] = br.readLine().split(" ");

        M = Integer.parseInt(str1[0]);
        N = Integer.parseInt(str1[1]);

        map = new int[M][N];
        dp = new int[M][N];
        for (int i = 0; i < M; i++) {
            String str2[] = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                dp[i][j] = -1;
                map[i][j] = Integer.parseInt(str2[j]);
            }
        }
        dp[M - 1][N - 1] = 1;
        bw.write(String.valueOf(go(0, 0)));
        bw.flush();
    }
    private static int go (int m, int n) {
        if (dp[m][n] > -1) return dp[m][n];
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int newx = m + xxxx[i];
            int newy = n + yyyy[i];
            if (M > newx && N > newy && 0 <= newx && 0 <= newy) {
                if (map[m][n] > map[newx][newy]) {
                    result += go(newx, newy);
                }
            }
        }
        return dp[m][n] = result;
    }
}