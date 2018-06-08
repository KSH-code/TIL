import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11057
 * BOJ 백준온라인져지 11057 오르막 수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N + 1][10];
        for (int i = 0; i < 10; i++) dp[1][i] = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 9; k >= j; k--) {
                    dp[i][j] += dp[i - 1][k];
                }
                dp[i][j] %= 10007;
            }
        }
        bw.write(String.valueOf(Arrays.stream(dp[N]).sum() % 10007));
        bw.flush();
    }
}