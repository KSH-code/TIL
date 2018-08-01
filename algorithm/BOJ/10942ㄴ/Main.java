import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10942
 * BOJ 백준온라인져지 10942 팰린드롬? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        boolean dp[][] = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            dp[i][i] = true;
            if (i + 1 < N) dp[i][i + 1] = arr[i] == arr[i + 1];
        }
        for (int i = 2; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                if (dp[j + 1][j + i - 1] && arr[j] == arr[j + i]) dp[j][j + i] = true;
            }
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            bw.write(dp[a][b] ? '1' : '0');
            bw.write("\n");
        }
        bw.flush();
    }
}