import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1799
 * BOJ 백준온라인져지 1799 비숍 풀이
 */
public class Main {
    private static boolean[][] canBishop;
    private static int N;
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        canBishop = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String str1[] = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                canBishop[i][j] = str1[j - 1].equals("1");
            }
        }
        int result = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (canBishop[i][j]) {
                    if (check(i, j, true, false) && check(i, j, false, false)) result++;
                    else canBishop[i][j] = false;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static boolean check (int x, int y, boolean left, boolean checkStart) {
        if (x < 1 || y < 1 || x > N || y > N) return true;
        if (checkStart && canBishop[x][y]) return false;
        if (left) {
            x--;
            y--;
        } else {
            x--;
            y++;
        }
        return check(x, y, left, true);
    }

}