import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15965
 * BOJ 백준온라인져지 15965 K번째 소수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long dp[] = new long[N];
        long c = 1;
        for (int i = 0; i < N; i++) {
            c++;
            boolean isPrimeNumber = true;
            for (int j = 0; j < i; j++) {
                if (dp[j] > Math.sqrt(c)) break;
                if (c % dp[j] == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (!isPrimeNumber) i--;
            else dp[i] = c;
        }
        bw.write(String.valueOf(dp[N - 1]));
        bw.flush();
    }
}