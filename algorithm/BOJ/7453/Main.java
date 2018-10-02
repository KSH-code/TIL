import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7453
 * BOJ 백준온라인져지 7453 합이 0인 네 정수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static long B[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        B = new long[N * N];
        long arr[][] = new long[N][4];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Long.parseLong(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i * N + j] -= arr[i][2] + arr[j][3];
            }
        }
        Arrays.sort(B);
        long result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int lo = lowerBound(0, B.length, arr[i][0] + arr[j][1]);
                int hi = upperBound(0, B.length, arr[i][0] + arr[j][1]);
                result += hi - lo;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static int lowerBound (int s, int e, long c) {
        int m;
        while (e - s > 0) {
            m = (s + e) / 2;
            if (B[m] < c) s = m + 1;
            else e = m;
        }
        return e + 1;
    }
    private static int upperBound (int s, int e, long c) {
        int m;
        while (e - s > 0) {
            m = (s + e) / 2;
            if (B[m] <= c) s = m + 1;
            else e = m;
        }
        return e + 1;
    }
}