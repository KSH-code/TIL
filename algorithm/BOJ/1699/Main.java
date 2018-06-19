import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1699
 * BOJ 백준온라인져지 1699 제곱수의 합 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N + 2];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                if (i == j * j) {
                    dp[i] = 1;
                    break;
                }
                dp[i] = Math.min(dp[i - j * j] + dp[j * j], dp[i]);
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}
