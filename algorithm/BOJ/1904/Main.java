import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1904
 * BOJ 백준온라인져지 1904 01타일 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}