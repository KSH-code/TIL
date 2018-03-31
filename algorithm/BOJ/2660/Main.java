import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2660
 * BOJ 백준온라인져지 2660 회장뽑기 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int distance[][] = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                distance[i][j] = 12341234;
            }
        }
        while (true) {
            String str1[] = br.readLine().split(" ");
            int a = Integer.parseInt(str1[0]);
            int b = Integer.parseInt(str1[1]);
            if (a == -1 && b == -1) break;
            distance[b][a] = distance[a][b] = 1;
        }
        for (int k = 1; k <= N; k++) {
            distance[k][k] = 1;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }
        int max[] = new int[N + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                max[i] = Math.max(distance[i][j], max[i]);
            }
            min = Math.min(max[i], min);
        }
        int count = 0;
        ArrayList<Integer> idxList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (min == max[i]) {
                idxList.add(i);
            }
        }
        bw.write(min + " " + idxList.size() + "\n");
        for (int idx : idxList) {
            bw.write(idx + " ");
        }
        bw.flush();
    }
}