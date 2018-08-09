import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1707
 * BOJ 백준온라인져지 1707 이분 그래프 풀이
 */
public class Main {
    private static ArrayList<Integer> v1[];
    private static ArrayList<Integer> v2[];
    private static int c[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        while ((testCase--) > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            v1 = new ArrayList[V + 1];
            v2 = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                v1[i] = new ArrayList<>();
                v2[i] = new ArrayList<>();
            }
            boolean yes = true;
            for (int i = 1; i <= V; i++) {
                if (dfs(i, 1)) {
                    yes = false;
                    break;
                }
            }
            bw.write(yes ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
    private static boolean dfs (int x, int color) {

    }
}