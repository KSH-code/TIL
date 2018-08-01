import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11404
 * BOJ 백준온라인져지 11404 플로이드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int edges[][] = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) edges[i][j] = 987654321;
            edges[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges[s][e] = Math.min(w, edges[s][e]);
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (edges[j][k] > edges[j][i] + edges[i][k]) {
                        edges[j][k] = edges[j][i] + edges[i][k];
                    }
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                bw.write(String.valueOf(edges[i][j] == 987654321 ? 0 : edges[i][j]));
                bw.write(' ');
            }
            bw.write("\n");
        }
        bw.flush();
    }
}