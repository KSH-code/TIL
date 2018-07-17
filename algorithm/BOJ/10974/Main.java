import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10974
 * BOJ 백준온라인져지 10974 모든 순열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int check = 0, N;
    private static int node[] = new int[8];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(0);
        bw.flush();
    }
    private static void dfs (int x) throws IOException {
        if (x == N) {
            for (int i = 0; i < N; i++) {
                bw.write(String.valueOf(node[i]));
                bw.write(" ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if ((check & (1 << i)) > 0) continue;
            node[x] = i + 1;
            check |= 1 << i;
            dfs(x + 1);
            check -= 1 << i;
        }
    }
}
