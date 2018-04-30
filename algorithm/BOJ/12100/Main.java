import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12100
 * BOJ 백준온라인져지 12100 2048 (Easy) 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;
    static class Position {
        public int x, y;
        public Position (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int map[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(str1[j]);
            }
        }
        bw.write(String.valueOf(move(map, 0, -1)));
        bw.flush();
    }
    private static int move (int map[][], int cnt, int direction) throws IOException {
        if (cnt == 6) return getMax(map);
        if (direction == UP) { // 위로
            for (int i = 0; i < N; i++) { // 좌우
                for (int j = N - 1; j > 0; j--) {
                    if (map[j - 1][i] == 0) map[j - 1][i] = map[j][i];
                    else if (map[j - 1][i] == map[j][i]) map[j - 1][i] += map[j][i];
                    map[j][i] = 0;
                }
                int zero = 0;
                boolean zeroPush = false;
                for (int j = 0; j < N; j++) {
                    if (map[j][i] == 0) {
                        if (zeroPush) {
                            zero = 0;
                        }
                        zero++;
                        zeroPush = false;
                    } else {
                        if (zero == 0) continue;
                        zeroPush = true;
                        map[j - zero][i] = map[j][i];
                        map[j][i] = 0;
                    }
                }
            }
        } else if (direction == DOWN) { // 아래로
            for (int i = 0; i < N; i++) { // 좌우
                for (int j = 0; j < N - 1; j++) {
                    if (map[j + 1][i] == 0) map[j + 1][i] = map[j][i];
                    else if (map[j + 1][i] == map[j][i]) map[j + 1][i] += map[j][i];
                    map[j][i] = 0;
                }
                int zero = 0;
                boolean zeroPush = false;
                for (int j = N - 1; j >= 0; j--) {
                    if (map[j][i] == 0) {
                        if (zeroPush) {
                            zero = 0;
                        }
                        zero++;
                        zeroPush = false;
                    } else {
                        if (zero == 0) continue;
                        zeroPush = true;
                        map[j + zero][i] = map[j][i];
                        map[j][i] = 0;
                    }
                }
            }
        } else if (direction == LEFT) { // 왼쪽으로
            for (int i = 0; i < N; i++) { // 상하
                for (int j = N - 1; j > 0; j--) {
                    if (map[i][j - 1] == 0) map[i][j - 1] = map[i][j];
                    else if (map[i][j - 1] == map[i][j]) map[i][j - 1] += map[i][j];
                    map[i][j] = 0;
                }
                int zero = 0;
                boolean zeroPush = false;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 0) {
                        if (zeroPush) {
                            zero = 0;
                        }
                        zero++;
                        zeroPush = false;
                    } else {
                        if (zero == 0) continue;
                        zeroPush = true;
                        map[i][j - zero] = map[i][j];
                        map[i][j] = 0;
                    }
                }
            }
        } else if (direction == RIGHT) { // 오른쪽으로
            for (int i = 0; i < N; i++) { // 상하
                for (int j = 0; j < N - 1; j++) {
                    if (map[i][j + 1] == 0) map[i][j + 1] = map[i][j];
                    else if (map[i][j + 1] == map[i][j]) map[i][j + 1] += map[i][j];
                    map[i][j] = 0;
                }
                int zero = 0;
                boolean zeroPush = false;
                for (int j = N - 1; j >= 0; j--) {
                    if (map[i][j] == 0) {
                        if (zeroPush) {
                            zero = 0;
                        }
                        zero++;
                        zeroPush = false;
                    } else {
                        if (zero == 0) continue;
                        zeroPush = true;
                        map[i][j + zero] = map[i][j];
                        map[i][j] = 0;
                    }
                }
            }
        }
        cnt++;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            int tempMap[][] = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    bw.write(map[j][k] + " ");
                    tempMap[j][k] = map[j][k];
                }
                bw.write("\n");
            }
            bw.write("\n");
            max = Math.max(move(tempMap, cnt, i), max);
        }
        return max;
    }
    private static int getMax (int map[][]) {
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max = Math.max(max, map[i][j]);
            }
        }
        return max;
    }
}