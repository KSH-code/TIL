import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1051
 * BOJ 백준온라인져지 1051 숫자 정사각형 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int map[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        int result = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 1; k < Math.max(N, M); k++) {
                    int maxX = j + k;
                    int maxY = i + k;
                    if (maxX >= M || maxY >= N || map[i][j] != map[maxY][j] || map[i][j] != map[maxY][maxX] || map[i][j] != map[i][maxX]) continue;
                    result = Math.max(result, k + 1);
                }
            }
        }
        bw.write(String.valueOf(result * result));
        bw.flush();
    }
}
