import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9465
 * BOJ 백준온라인져지 9465 스티커 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static boolean map[][];
    private static boolean isVisited[][];
    private static int N = 0;
    private static int M = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int dp[][] = new int[2][N + 1];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                dp[0][i] = Math.max(dp[1][i - 1] + Integer.parseInt(st1.nextToken()), dp[0][i - 1]);
                dp[1][i] = Math.max(dp[0][i - 1] + Integer.parseInt(st2.nextToken()), dp[1][i - 1]);
            }
            bw.write(String.valueOf(Math.max(dp[0][N], dp[1][N])));
            bw.write("\n");
        }
        bw.flush();
    }
}