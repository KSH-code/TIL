import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2858
 * BOJ 백준온라인져지 2858 기숙사 바닥 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int R = Integer.parseInt(str1[0]);
        int B = Integer.parseInt(str1[1]);
        int sum = R + B;
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < R; j++) {
                if (i * 2 + (j - 2) * 2 == R && (i - 2) * (j - 2) == B) {
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }
        bw.flush();
    }
}