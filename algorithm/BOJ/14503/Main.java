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
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken()) - 1;
        boolean map[][] = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j * 2) == '0';
            }
        }
        int result = 1;
        int xxxx[] = { 0, -1, 0, 1 };
        int yyyy[] = { -1, 0, 1, 0 };
        int checkDir = 0;
        int lastX = -1;
        int lastY = -1;
        while (true) {
            dir = (dir + 1) % 4;
            map[r][c] = false;
            int curX = r + xxxx[dir];
            int curY = c + yyyy[dir];
            if (checkDir == 4) dir = (dir + 2) % 4; // 후진했던 경우
            if (curX >= N || curY >= M || curX < 0 || curY < 0) break;
            if (map[curX][curY]) {
                result++;
                r = curX;
                c = curY;
                checkDir = 0;
                continue;
            } else {
                checkDir++;
                if (checkDir == 5) {
                    break;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
