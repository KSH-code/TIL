import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10164
 * BOJ 백준온라인져지 10164 격자상의 경로 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N + 1][M + 1];
        dp[1][1] = 1;
        int x = (int) Math.ceil((float) K / M);
        int y = K % M;
        if (y == 0) y = M;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (K == 0) {
                    dp[i][j] += dp[i][j - 1] + dp[i - 1][j];
                    continue;
                }
                if ((i <= x && j <= y) || (x <= i && y <= j)) dp[i][j] += dp[i][j - 1] + dp[i - 1][j];
            }
        }
        bw.write(String.valueOf(dp[N][M]));
        bw.flush();
    }
}
