import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9461
 * BOJ 백준온라인져지 9461 파도반 수열 풀이
 */
public class Main {
    private static long dp[] = new long[150];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 3; i++) {
            dp[i] = 1;
        }
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N] + "\n");
        }
        bw.flush();
    }
}