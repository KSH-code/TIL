import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3460
 * BOJ 백준온라인져지 3460 이진수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; n >= 1 << j; j++) {
                if ((n & (1 << j)) >= 1) bw.write(j + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}