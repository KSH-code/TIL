import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12785
 * BOJ 백준온라인져지 12785 토쟁이의 등굣길 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        String str2[] = br.readLine().split(" ");
        int w = Integer.parseInt(str1[0]);
        int h = Integer.parseInt(str1[1]);
        int x = Integer.parseInt(str2[0]);
        int y = Integer.parseInt(str2[1]);
        long dp[][] = new long[h][w];
        for (int i = 0; i < h; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < w; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000007;
            }
        }
        bw.write(String.valueOf((dp[y - 1][x - 1] * dp[h - y][w - x]) % 1000007));
        bw.flush();
    }
}