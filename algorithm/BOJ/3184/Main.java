import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3184
 * BOJ 백준온라인져지 3184 양 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int v = 0;
    private static int o = 0;
    private static int R;
    private static int C;
    private static char map[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        R = Integer.parseInt(str1[0]);
        C = Integer.parseInt(str1[1]);
        map = new char[R][C];
        for (int i = 0; i < R; i++) map[i] = br.readLine().toCharArray();
        int resultO = 0;
        int resultV = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] != '#' && map[i][j] != 'x') {
                    v = o = 0;
                    dfs(i, j);
                    if (v >= o) resultV += v;
                    else resultO += o;
                }
            }
        }
        bw.write(resultO + " " + resultV);
        bw.flush();
    }
    private static int xxxx[] = { 0, 1, 0, -1 };
    private static int yyyy[] = { -1, 0, 1, 0 };
    private static void dfs (int curX, int curY) {
        if (map[curX][curY] == 'o') o++;
        else if (map[curX][curY] == 'v') v++;
        map[curX][curY] = 'x';
        for (int i = 0; i < 4; i++) {
            int x = curX + xxxx[i];
            int y = curY + yyyy[i];
            if (x < 0 || y < 0 || x >= R || y >= C || map[x][y] == '#' || map[x][y] == 'x') continue;
            dfs(x, y);
        }
    }
}