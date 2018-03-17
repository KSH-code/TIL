import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2580
 * BOJ 백준온라인져지 2580 스도쿠 풀이
 */
public class Main {
    static class Point {
        public int x, y;
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int map[][] = new int[9][9];
    private static int row[] = new int[9];
    private static int col[] = new int[9];
    private static int group[] = new int[9];
    private static ArrayList<Point> zeroList = new ArrayList<>();
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 9; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(str1[j]);
                row[i] += 1 << map[i][j] - 1;
                col[j] += 1 << map[i][j] - 1;
                group[i / 3 * 3 + j / 3] += 1 << map[i][j] - 1;
                if (map[i][j] == 0) zeroList.add(new Point(i, j));
            }
        }
        dfs(0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(map[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
    private static boolean dfs (int idx) {
        if (idx == zeroList.size()) return true;
        Point p = zeroList.get(idx);
        int x = p.x, y = p.y;
        for (int i = 0; i < 9; i++) {
            if ((group[x / 3 * 3 + y / 3] & 1 << i) > 0 || (row[x] & 1 << i) > 0 || (col[y] & 1 << i) > 0) continue;
            group[x / 3 * 3 + y / 3] += 1 << i;
            row[x] += 1 << i;
            col[y] += 1 << i;
            map[x][y] = i + 1;
            if (!dfs(idx + 1)) {
                group[x / 3 * 3 + y / 3] -= 1 << i;
                row[x] -= 1 << i;
                col[y] -= 1 << i;
                map[x][y] = 0;
            } else return true;
        }
        return false;
    }
}