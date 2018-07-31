import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11054
 * BOJ 백준온라인져지 11054 가장 긴 바이토닉 부분 수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        int dp[][] = new int[2][N];
        int result = 0;
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            dp[0][i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1);
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            dp[1][i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[i] > arr[j]) dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
            }
        }
        for (int i = 0; i < N; i++) result = Math.max(result, dp[0][i] + dp[1][i]);
        bw.write(String.valueOf(result - 1));
        bw.flush();
    }
}