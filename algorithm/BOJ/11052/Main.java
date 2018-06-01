import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11052
 * BOJ 백준온라인져지 11052 붕어빵 판매하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P[] = new int[N + 1];
        int dp[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i] = P[i] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], P[j] + dp[i - j]);
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}