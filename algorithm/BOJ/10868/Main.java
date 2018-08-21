import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10868
 * BOJ 백준온라인져지 10868 최소값 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int tree[], arr[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        tree = new int[1 << (int) Math.ceil(Math.log(N) / Math.log(2)) + 1];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
        init(1, 0, N - 1);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(find(1, 0, N - 1, a - 1, b - 1)));
            bw.write("\n");
        }
        bw.flush();
    }
    private static int init (int n, int s, int e) {
        if (s == e) return tree[n] = arr[s];
        int m = (s + e) / 2;
        return tree[n] = Math.min(init(n * 2, s, m), init(n * 2 + 1, m + 1, e));
    }
    private static int find (int n, int s, int e, int l, int r) {
        if (l > e || r < s) return Integer.MAX_VALUE;
        if (l <= s && r >= e) return tree[n];
        int m = (s + e) / 2;
        return Math.min(find(n * 2, s, m, l, r), find(n * 2 + 1, m + 1, e, l, r));
    }
}
