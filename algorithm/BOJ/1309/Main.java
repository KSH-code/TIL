import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1309
 * BOJ 백준온라인져지 1309 동물원 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[N + 1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }
        bw.write(String.valueOf((dp[N][0] + dp[N][1] + dp[N][2]) % 9901));
        bw.flush();
    }
}
