import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15988
 * BOJ 백준온라인져지 15988 1, 2, 3 더하기 3 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long dp[] = new long[N + 4];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int i = 4; i <= N; i++) {
                dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % 1000000009;
            }
            bw.write(String.valueOf(dp[N]));
            bw.write("\n");
        }
        bw.flush();
    }
}