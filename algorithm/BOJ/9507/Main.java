import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/9507
 * BOJ 백준온라인져지 9507 Generations of Tribbles 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        BigInteger dp[] = new BigInteger[70];
        dp[1] = dp[0] = BigInteger.ONE;
        dp[2] = BigInteger.valueOf(2);
        dp[3] = BigInteger.valueOf(4);
        for (int i = 4; i < 70; i++) {
            dp[i] = dp[i - 4].add(dp[i - 3].add(dp[i - 2].add(dp[i - 1])));
        }
        while (testcase-- > 0) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N].toString());
            bw.write("\n");
        }
        bw.flush();
    }
}