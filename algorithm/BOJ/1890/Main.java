import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1890
 * BOJ 백준온라인져지 1890 점프 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];
        long dp[][] = new long[N][N];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (dp[i][j] == 0 || (i == N - 1 && j == N - 1)) continue; // 가지치기
                else {
                    if (i + map[i][j] < N) dp[i + map[i][j]][j] += dp[i][j];
                    if (j + map[i][j] < N) dp[i][j + map[i][j]] += dp[i][j];
                }
            }
        };
        bw.write(String.valueOf(dp[N - 1][N - 1]));
        bw.flush();
    }
}
