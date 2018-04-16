import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2532
 * BOJ 백준온라인져지 2532 반도체 설계 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int dp[] = new int[N + 1];
        int arr[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(str1[i - 1]);
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i]) dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(dp[i], max);
        }
        bw.write(String.valueOf(max + 1));
        bw.flush();
    }
}