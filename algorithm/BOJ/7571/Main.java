import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7571
 * BOJ 백준온라인져지 7571 점 모으기 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        int dotX[] = new int[M];
        int dotY[] = new int[M];
        for (int i = 0; i < M; i++) {
            String str2[] = br.readLine().split(" ");
            int x = Integer.parseInt(str2[0]);
            int y = Integer.parseInt(str2[1]);
            dotX[i] = x;
            dotY[i] = y;
        }
        Arrays.sort(dotX);
        Arrays.sort(dotY);
        int result = 0;
        int x = dotX[M / 2];
        int y = dotY[M / 2];
        for (int i = 0; i < M; i++) {
            result += Math.abs(dotX[i] - x);
            result += Math.abs(dotY[i] - y);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}