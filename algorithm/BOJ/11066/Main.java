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
            int chapter[] = new int[N + 1];
            int dp[][] = new int[N + 1][N + 1];
            String str1[] = br.readLine().split(" ");
            for (int i = 1; i <= N; i++) {
                chapter[i] = chapter[i - 1] + Integer.parseInt(str1[i - 1]);
            }
            for (int i = 1; i < N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    dp[i][j] = 987654321;
                    for (int k = i; k <= j; k++) {
                        int temp = dp[i][k] + dp[k][j];
                        if (dp[i][j] > temp) dp[i][j] = temp;
                    }
                    dp[i][j] += chapter[i] - chapter[j];
                }
            }
            bw.write((dp[1][N]) + "\n");
        }

        bw.flush();
    }
}