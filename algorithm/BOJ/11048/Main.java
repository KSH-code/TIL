import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11048
 * BOJ 백준온라인져지 11048 이동하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int dp[] = new int[M + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                int weight = Integer.parseInt(st.nextToken());
                dp[j] = Math.max(dp[j - 1], dp[j]) + weight;
            }
        }
        bw.write(String.valueOf(dp[M]));
        bw.flush();
    }
}
