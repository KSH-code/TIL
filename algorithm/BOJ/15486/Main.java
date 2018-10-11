import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15486
 * BOJ 백준온라인져지 15486 퇴사 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cost[][] = new int[N + 1][2];
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            cost[i][0] = t;
            cost[i][1] = c;
        }
        int dp[] = new int[N + 2];
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int curCost = dp[i];
            int next = cost[i][0] + i;
            int max = curCost;
            if (next <= N + 1) max = Math.max(max, dp[next] = Math.max(dp[next], curCost + cost[i][1]));
            if (i + 1 <= N + 1) max = Math.max(max, dp[i + 1] = Math.max(dp[i + 1], curCost));
            result = Math.max(result, max);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}