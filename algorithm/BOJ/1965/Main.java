import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1965
 * BOJ 백준온라인져지 1965 상자넣기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = 0;
        int arr[] = new int[N];
        int dp[] = new int[N];
        for (int i = 0; i < N; i++) {
            int t = arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            m = Math.max(m, dp[i]);
        }
        bw.write(String.valueOf(m));
        bw.flush();
    }
}
