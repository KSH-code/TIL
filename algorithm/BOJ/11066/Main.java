import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11066
 * BOJ 백준온라인져지 11066 파일 합치기 풀이
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());

        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pSum[] = new int[N + 1];
            int dp[][] = new int[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                pSum[i] = pSum[i - 1] + Integer.parseInt(st.nextToken());
            }
            for (int i = 2; i <= N; i++) {
                for (int j = i - 1; j > 0; j--) {
                    dp[j][i] = 987654321;
                    for (int k = j; k < i; k++) {
                        dp[j][i] = Math.min(dp[j][i], dp[j][k] + dp[k + 1][i]);
                    }
                    dp[j][i] += pSum[i] - pSum[j - 1];
                }
            }
            bw.write(String.valueOf(dp[1][N]));
            bw.write("\n");
        }
        bw.flush();
    }
}