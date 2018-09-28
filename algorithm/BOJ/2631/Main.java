import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2631
 * BOJ 백준온라인져지 2631 줄세우기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int dp[] = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            result = Math.max(result, dp[i]);
        }
        bw.write(String.valueOf(N - result));
        bw.flush();
    }
}