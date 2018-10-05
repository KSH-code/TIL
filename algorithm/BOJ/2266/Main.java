import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2266
 * BOJ 백준온라인져지 2266 금고 테스트 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int d[][] = new int[N + 1][K + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (j == 1) {
                    d[i][j] = i;
                    continue;
                }
                d[i][j] = (int) 1e9;
                for (int k = 1; k <= i; k++) {
                    d[i][j] = Math.min(d[i][j], Math.max(d[k - 1][j - 1], d[i - k][j]) + 1);
                }
            }
        }
        bw.write(String.valueOf(d[N][K]));
        bw.flush();
    }
}