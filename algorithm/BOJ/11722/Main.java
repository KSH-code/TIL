import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11722
 * BOJ 백준온라인져지 11722 가장 긴 감소하는 부분 수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dp[] = new int[N];
        int arr[] = new int[N];
        int i = 0;
        int max = 0;
        while (st.hasMoreTokens()) {
            dp[i] = 1;
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            max = Math.max(dp[i], max);
            i++;
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}