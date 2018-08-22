import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11725
 * BOJ 백준온라인져지 11725 트리의 부모 찾기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static ArrayList<Integer> edges[];
    private static int parent[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        edges = new ArrayList[N + 1];
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) edges[i] = new ArrayList<>(2);
        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
            edges[b].add(a);
        }
        dfs(1);
        for (int i = 2; i <= N; i++) {
            bw.write(String.valueOf(parent[i]));
            bw.write("\n");
        }
        bw.flush();
    }
    private static void dfs (int s) {
        for (int i = 0; i < edges[s].size(); i++) {
            int t = edges[s].get(i);
            if (parent[t] != 0) continue;
            parent[t] = s;
            dfs(t);
        }
    }
}
