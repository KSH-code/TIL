import java.util.*;
import java.io.*;
public class Solution {
    static class Robot {
        public int x, y, w, d;
        public Robot (int x, int y, int w, int d) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.d = d;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        Queue<Robot> q = new LinkedList<>();
        boolean isVisited[][][] = new boolean[N + 1][M + 1][4];
        q.offer(new Robot(0, 0, 0, 0));
        int xxxx[] = { 0, -1, 0, 1 };
        int yyyy[] = { 1, 0, -1, 0 };
        while (!q.isEmpty()) {
            Robot r = q.poll();
            if (r.x == X && r.y == Y) {
                bw.write(String.valueOf(r.w));
                break;
            }
            int d = r.d;
            isVisited[r.x][r.y][d] = true;
            int nextX = r.x + xxxx[d];
            int nextY = r.y + yyyy[d];
            d = (d + 1) % 4;
            if (nextX >= 0 && nextY >= 0 && nextX <= N && nextY <= M && !isVisited[nextX][nextY][d]) {
                isVisited[nextX][nextY][d] = true;
                q.offer(new Robot(nextX, nextY, r.w + 1, d));
            }
            nextX = r.x + xxxx[d];
            nextY = r.y + yyyy[d];
            if (nextX >= 0 && nextY >= 0 && nextX <= N && nextY <= M && !isVisited[nextX][nextY][d]) {
                isVisited[nextX][nextY][d] = true;
                q.offer(new Robot(nextX, nextY, r.w + 1, d));
            }
            if (!isVisited[r.x][r.y][d]) {
                isVisited[r.x][r.y][d] = true;
                q.offer(new Robot(r.x, r.y, r.w + 1, d));
            }
        }
        bw.flush();
    }
}