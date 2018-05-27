import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10163
 * BOJ 백준온라인져지 10163 색종이 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[101][101];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x1 + x2; j++) {
                for (int k = y1; k < y1 + y2; k++) {
                    map[j][k] = i;
                }
            }
        }
        for (int z = 1; z <= N; z++) {
            int cnt = 0;
            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    if (map[i][j] == z) cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }
}