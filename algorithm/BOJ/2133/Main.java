import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2133
 * BOJ 백준온라인져지 2133 타일 채우기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N + 2];
		dp[0] = 1;
		dp[2] = 3;
		for (int i = 4; i <= N; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = 4; j <= i; j += 2) {
                dp[i] += dp[i - j] * 2;
            }
		}
		bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}
