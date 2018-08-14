import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/14503
 * BOJ 백준온라인져지 14503 로봇 청소기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());
        int map[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j * 2) - (int) '0';
            }
        }
        int result = 1;
        int xxxx[] = { -1, 0, 1, 0 };
        int yyyy[] = { 0, 1, 0, -1 };
        while (true) {
            map[x][y] = 2;
            dir = (dir + 3) % 4;
            int tX = x + xxxx[dir];
            int tY = y + yyyy[dir];
            if (tX < N && tY < M && tX >= 0 && tY >= 0) {
                if (map[tX][tY] == 0) {
                    result++;
                    x = tX;
                    y = tY;
                    continue;
                }
            }
            int c = 0;
            for (int i = 0; i < 4; i++) {
                int ttX = x + xxxx[i];
                int ttY = y + yyyy[i];
                if (ttX >= N || ttY >= M || ttX < 0 || ttY < 0 || map[ttX][ttY] > 0) c++;
            }
            if (c == 4) {
                dir = (dir + 3) % 4;
                int ttX = x + xxxx[dir];
                int ttY = y + yyyy[dir];
                if (ttX >= N || ttY >= M || ttX < 0 || ttY < 0 || map[ttX][ttY] == 1) break;
                x = ttX;
                y = ttY;
                dir = (dir + 6) % 4;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
