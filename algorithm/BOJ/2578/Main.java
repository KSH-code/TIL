import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2578
 * BOJ 백준온라인져지 2578 빙고 풀이
 */
public class Main {
    private static int map[][] = new int[5][5];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 5; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(str1[j]);
            }
        }
        for (int i = 0; i < 5; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                if (checkLine(Integer.parseInt(str1[j])) >= 3) {
                    System.out.println((5 * i) + (j + 1));
                    return;
                }
            }
        }
        bw.flush();
    }
    private static int checkLine (int n) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == n) map[i][j] = 0;
            }
        }
        // 가로라인
        for (int i = 0; i < 5; i++) {
            boolean clearLine = true;
            for (int j = 0; j < 5; j++) {
                if (map[i][j] > 0) {
                    clearLine = false;
                }
            }
            if (clearLine) result++;
        }
        // 세로라인
        for (int i = 0; i < 5; i++) {
            boolean clearLine = true;
            for (int j = 0; j < 5; j++) {
                if (map[j][i] > 0) {
                    clearLine = false;
                }
            }
            if (clearLine) result++;
        }
        // 왼쪽 대각선
        for (int i = 0; i < 1; i++) {
            boolean clearLine = true;
            for (int j = 0; j < 5; j++) {
                if (map[j][j] > 0) {
                    clearLine = false;
                }
            }
            if (clearLine) result++;
        }
        // 오른쪽 대각선
        for (int i = 0; i < 1; i++) {
            boolean clearLine = true;
            for (int j = 0; j < 5; j++) {
                if (map[4 - j][j] > 0) {
                    clearLine = false;
                }
            }
            if (clearLine) result++;
        }
        return result;
    }
}