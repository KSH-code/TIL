import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1208
 * BOJ 백준온라인져지 1208 부분집합의 합 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int A[] = new int[4000001], K, arr[], B[] = new int[4000001];
    private static long result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfsA(0, 0, N / 2, false);
        dfsB(N / 2, 0, N, false);
        K += 4000000;
        for (int i = 0; i <= 4000000; i++) {
            int b = K - i;
            if (b < 0 || b > 4000000) continue;
            result += ((long) A[i]) * ((long) B[b]);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void dfsA (int x, int r, int breakNumber, boolean up) {
        if (up) {
            if (r + 2000000 <= 4000000 && r + 2000000 >= 0) A[r + 2000000]++;
            if (r == K) result++;
        }
        if (x == breakNumber) return;
        dfsA(x + 1, r + arr[x], breakNumber, true);
        dfsA(x + 1, r, breakNumber, false);
    }
    private static void dfsB (int x, int r, int breakNumber, boolean up) {
        if (up) {
            if (r + 2000000 <= 4000000 && r + 2000000 >= 0) B[r + 2000000]++;
            if (r == K) result++;
        }
        if (x == breakNumber) return;
        dfsB(x + 1, r + arr[x], breakNumber, true);
        dfsB(x + 1, r, breakNumber, false);
    }
}