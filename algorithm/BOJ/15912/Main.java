import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15912
 * BOJ 백준온라인져지 15912 우주선 만들기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long w[] = new long[N];
        long e[] = new long[N];
        long price[] = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = Long.parseLong(st1.nextToken());
            e[i] = Long.parseLong(st2.nextToken());
        }
        long mW[][] = new long[N][N];
        long mE[][] = new long[N][N];
        for (int i = 0; i < N; i++) {
            mW[i][i] = w[i];
            mE[i][i] = e[i];
            for (int j = i + 1; j < N; j++) {
                mW[i][j] = Math.max(mW[i][j], w[j]);
                mE[i][j] = Math.max(mE[i][j], e[j]);
            }
        }
        long dp[] = new long[N];
        for (int i = 0; i < N; i++) {
            dp[i] = mW[0][i] * mE[0][i];
            long t = 0;
            for (int j = 0; j < N; j++) {
                dp[i] = Math.min(dp[i], dp[j] + mW[j][i] * mE[j][i]);
            }
        }
        bw.write(String.valueOf(dp[N - 1]));
        bw.flush();
    }
}