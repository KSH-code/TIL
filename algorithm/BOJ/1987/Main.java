import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1987
 * BOJ 백준온라인져지 1987 알파벳 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int check = 0;
    private static int map[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - 'A';
            }
        }
        bw.write(String.valueOf(dfs(0, 0)));
        bw.flush();
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    private static int dfs (int x, int y) {
        if ((check & (1 << map[x][y])) > 0) return 0;
        check |= 1 << map[x][y];
        int result = 1;
        for (int i = 0; i < 4; i++) {
            int curX = x + xxxx[i];
            int curY = y + yyyy[i];
            if (curX < 0 || curY < 0 || curX >= map.length || curY >= map[0].length || (check & (1 << map[curX][curY])) > 0) continue;
            result = Math.max(result, dfs(curX, curY) + 1);
            check -= 1 << map[curX][curY];
        }
        return result;
    }
}
