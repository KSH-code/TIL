import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2169
 * BOJ 백준온라인져지 2169 로봇 조종하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int dp[][][] = new int[N + 1][M + 1][2];
        int map[][] = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                int t = Integer.parseInt(st.nextToken());
                map[i][j] = t;
            }
        }
        for (int i = 1; i <= M; i++) dp[1][i][0] = dp[1][i - 1][0] + map[1][i];
        for (int i = 2; i <= N; i++) {
            dp[i][1][0] = dp[i - 1][1][0] + map[i][1];
            for (int j = 2; j <= M; j++) dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i][j - 1][0]) + map[i][j];
            dp[i][M][1] = dp[i - 1][M][0] + map[i][M];
            for (int j = M - 1; j >= 1; j--) dp[i][j][1] = Math.max(dp[i - 1][j][0], dp[i][j + 1][1]) + map[i][j];
            for (int j = 1; j <= M; j++) dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j][1]);
        }
        System.out.println(dp[N][M][0]);
        bw.flush();
    }
}
