import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2667
 * BOJ 백준온라인져지 2667 단지번호붙이기 풀이
 */
public class Main {
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, -1, 0, 1 };
    private static boolean visited[][] = new boolean[25][25];
    private static String map[][];
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new String[N][];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().split("");
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j].equals("1") && !visited[i][j]) arr.add(dfs(i, j));
            }
        }
        Collections.sort(arr);
        bw.write(arr.size() + "\n");
        for (int i = 0; i < arr.size(); i++) bw.write(arr.get(i) + "\n");
        bw.flush();
    }
    private static int dfs (int x, int y) {
        int ans = 1;
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int curx = x + xxxx[i];
            int cury = y + yyyy[i];
            if (curx >= N || cury >= N || curx < 0 || cury < 0 || map[curx][cury].equals("0") || visited[curx][cury]) continue;
            ans += dfs(curx, cury);
        }
        return ans;
    }
}