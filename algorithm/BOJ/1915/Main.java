import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1915
 * BOJ 백준온라인져지 1915 가장 큰 정사각형 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int dp[][] = new int[N + 1][M + 1];
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                if (str.charAt(j - 1) == '1') {
                    result = Math.max(result, dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1);
                }
            }
        }
        bw.write(String.valueOf(result * result));
        bw.flush();
    }
}
