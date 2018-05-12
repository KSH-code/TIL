import java.util.*;
import java.io.*;
import javax.script.*;

public class LargerClosedArea {
    static class Point {
        public int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    public static void main( String argv[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[111][111];
        for (int z = 0; z < N; z++) {
            String str1[] = br.readLine().split(",");
            int x1 = Integer.parseInt(str1[0]);
            int y1 = Integer.parseInt(str1[1]);
            int x2 = Integer.parseInt(str1[2]);
            int y2 = Integer.parseInt(str1[3]);
            for (int i = x1; i <= x2; i++) {
                map[i][y1] = -1;
                map[i][y2] = -1;
            }
            for (int i = y1; i <= y2; i++) {
                map[x1][i] = -1;
                map[x2][i] = -1;
            }
            for (int i = x1 + 1; i < x2; i++) {
                for (int j = y1 + 1; j < y2; j++) {
                    if (map[i][j] > -1) map[i][j]++;
                }
            }
        }
        boolean visited[][] = new boolean[111][111];
        Queue<Point> queue = new LinkedList<>();
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (map[i][j] > 0) queue.offer(new Point(i, j));
                int tempResult = 0;
                while (!queue.isEmpty()) {
                    Point p = queue.poll();
                    if (visited[p.x][p.y]) continue;
                    visited[p.x][p.y] = true;
                    tempResult++;
                    for (int k = 0; k < 4; k++) {
                        int curX = p.x + xxxx[k];
                        int curY = p.y + yyyy[k];
                        if (visited[curX][curY] || map[p.x][p.y] != map[curX][curY]) continue;
                        queue.offer(new Point(curX, curY));
                    }
                }
                result = Math.max(result, tempResult);
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
