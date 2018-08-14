import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2011
 * BOJ 백준온라인져지 2011 암호코드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int dp[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        dp = new int[str.length() + 1];
        dp[0] = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(str.length() - i - 1) == '0') continue;
            if (i > 0 && (str.charAt(str.length() - i - 1) == '1' || str.charAt(str.length() - i - 1) == '2')) {
                dp[i + 1] = dp[i - 1];
                if (!(str.charAt(str.length() - i - 1) == '2' && str.charAt(str.length() - i) >= '8')) dp[i + 1] += dp[i];
            } else dp[i + 1] = (dp[i + 1] + dp[i]);
            dp[i + 1] %= 1000000;
        }
        bw.write(String.valueOf(dp[str.length()]));
        bw.flush();
    }
}
