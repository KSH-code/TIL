import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2331 BOJ 백준온라인져지 2331 반복수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long t[] = new long[N + 1];
        t[0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                t[i] += t[j] * t[i - 1 - j];
            }
        }
        bw.write(String.valueOf(t[N]));
        bw.flush();
    }
}