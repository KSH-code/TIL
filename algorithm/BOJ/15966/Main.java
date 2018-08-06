import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15966
 * BOJ 백준온라인져지 15966 군계일학 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        int dp[] = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i] - 1) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            result = Math.max(result, dp[i]);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}