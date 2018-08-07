import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1924
 * BOJ 백준온라인져지 1924 2007년 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static String days[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken());
        int curX = 0;
        int curY = 1;
        int i = 1;
        while (curX != x || curY != y) {
            i = (i + 1) % 7;
            if (months[curX] == curY) {
                curY = 0;
                curX++;
            }
            curY++;
        }
        bw.write(String.valueOf(days[i]));
        bw.flush();
    }
}