import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2565
 * BOJ 백준온라인져지 2565 전깃줄 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int edges[] = new int[501];
        int dp[] = new int[501];
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            edges[Integer.parseInt(str1[0])] = Integer.parseInt(str1[1]);
        }
        int max = 0;
        for (int i = 1; i < 501; i++) {
            if (edges[i] > 0) dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (edges[j] > 0 && edges[j] < edges[i] && dp[j] + 1 > dp[i]) dp[i] = dp[j] + 1;
            }
            max = Math.max(max, dp[i]);
        }
        bw.write(String.valueOf(N - max));
        bw.flush();
    }
}