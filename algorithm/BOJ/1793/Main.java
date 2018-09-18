import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/1793
 * BOJ 백준온라인져지 1793 타일링 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        BigInteger dp[] = new BigInteger[251];
        dp[0] = dp[1] = BigInteger.ONE;
        for (int i = 2; i < 251; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2].multiply(BigInteger.valueOf(2)));
        }
        while ((str = br.readLine()) != null) {
            int N = Integer.parseInt(str);
            bw.write(dp[N].toString());
            bw.write("\n");
        }
        bw.flush();
    }
}