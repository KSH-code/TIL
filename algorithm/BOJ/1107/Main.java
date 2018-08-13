import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1107
 * BOJ 백준온라인져지 1107 리모컨 설치 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean arr[] = new boolean[10];
        if (M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) arr[Integer.parseInt(st.nextToken())] = true;
        }
        int dp[] = new int[1000001];
        for (int i = 0; i <= 1000000; i++) dp[i] = 987654321;
        dp[100] = 0;
        for (int i = 0; i <= 1000000; i++) {
            boolean can = true;
            int cnt = 0;
            int temp = i;
            while (temp >= 0) {
                if (arr[temp % 10]) {
                    can = false;
                    break;
                } else {
                    cnt++;
                    temp /= 10;
                }
                if (temp == 0) temp = -1;
            }
            if (can) dp[i] = Math.min(dp[i], cnt);
        }
        for (int i = 1000000; i >= 0; i--) {
            if (dp[i] != 987654321) {
                dp[N] = Math.min(dp[N], dp[i] + Math.abs(N - i));
            }
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}