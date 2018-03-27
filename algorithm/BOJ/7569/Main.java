import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7569
 * BOJ 백준온라인져지 7569 토마토 풀이
 */
public class Main {
    static class Tomato implements Comparable<Tomato> {
        public int x, y, z, w;
        public Tomato (int w, int x, int y, int z) {
            this.w = w;
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public int compareTo (Tomato t) {
            return this.w - t.w;
        }
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int M = Integer.parseInt(str1[0]);
        int N = Integer.parseInt(str1[1]);
        int H = Integer.parseInt(str1[2]);
        int tomato[][][] = new int[H + 1][N + 1][M + 1];
        PriorityQueue<Tomato> pQueue = new PriorityQueue<Tomato>();
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= N; j++) {
                String str2[] = br.readLine().split(" ");
                for (int k = 1; k <= M; k++) {
                    tomato[i][j][k] = Integer.parseInt(str2[k - 1]);
                    if (tomato[i][j][k] == 1) {
                        pQueue.offer(new Tomato(0, i, j, k));
                    }
                }
            }
        }
        int xxxx[] = { 1, -1, 0, 0, 0, 0 }; // 위 아래 앞 뒤 왼쪽 오른쪽
        int yyyy[] = { 0, 0, -1, 1, 0, 0 }; // 위 아래 앞 뒤 왼쪽 오른쪽
        int zzzz[] = { 0, 0, 0, 0, -1, 1 }; // 위 아래 앞 뒤 왼쪽 오른쪽
        int max = 0;
        while (!pQueue.isEmpty()) {
            Tomato t = pQueue.poll();
            if (max < t.w) max = t.w;
            for (int i = 0; i < 6; i++) {
                int curX = xxxx[i] + t.x;
                int curY = yyyy[i] + t.y;
                int curZ = zzzz[i] + t.z;
                if (curX > H || curX < 1 || curY > N || curY < 1 || curZ > M || curZ < 1 || tomato[curX][curY][curZ] != 0) continue;
                pQueue.offer(new Tomato(t.w + 1, curX, curY, curZ));
                tomato[curX][curY][curZ] = 1;
            }
        }
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    if (tomato[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}