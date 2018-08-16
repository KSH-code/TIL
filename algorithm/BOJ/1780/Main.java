import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1780
 * BOJ 백준온라인져지 1780 종이의 개수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int z = 0, m = 0, o = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        g(map, 0, 0, N / 3);
        bw.write(String.valueOf(m));
        bw.write("\n");
        bw.write(String.valueOf(z));
        bw.write("\n");
        bw.write(String.valueOf(o));
        bw.flush();
    }
    private static void g (int map[][], int x, int y, int c) {
        if (c == 0) {
            go(map, x, y);
            return;
        }
        boolean allClear = true;
        for (int i = x; i < x + c * 3; i++) {
            for (int j = y; j < y + c * 3; j++) {
                if (map[x][y] != map[i][j]) {
                    allClear = false;
                    break;
                }
            }
            if (!allClear) break;
        }
        if (allClear) {
            go(map, x, y);
            return;
        }
        g(map, x, y, c / 3);
        g(map, x + c, y, c / 3);
        g(map, x + c * 2, y, c / 3);
        g(map, x, y + c, c / 3);
        g(map, x + c , y + c, c / 3);
        g(map, x + c * 2, y + c, c / 3);
        g(map, x, y + c * 2, c / 3);
        g(map, x + c, y + c * 2, c / 3);
        g(map, x + c * 2, y + c * 2, c / 3);
    }
    private static void go (int map[][], int x, int y) {
        if (map[x][y] == -1) {
            m++;
            return;
        }
        if (map[x][y] == 0) {
            z++;
            return;
        }
        o++;
    }
}
