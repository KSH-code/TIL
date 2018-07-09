import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10451
 * BOJ 백준온라인져지 10451 순열 사이클 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int edges[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int z = 0; z < T; z++) {
            int N = Integer.parseInt(br.readLine());
            edges = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                edges[i] = Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for (int i = 1; i <= N; i++) {
                if (edges[i] > 0) {
                    dfs(i);
                    result++;
                }
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
    private static void dfs (int x) {
        int tempX = edges[x];
        edges[x] = 0;
        if (edges[tempX] > 0) dfs(tempX);
    }
}
