import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1024
 * BOJ 백준온라인져지 1024 수열의 합 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long L = Long.parseLong(st.nextToken());
        for (; L <= 100; L++) {
            long t = (L - 1) * L / 2;
            if ((N - t) / L >= 0 && (N - t) % L == 0) {
                for (long i = (N - t) / L; i < (N - t) / L + L; i++) {
                    bw.write(String.valueOf(i));
                    bw.write(" ");
                    bw.flush();
                }
                break;
            }
        }
        if (L == 101) bw.write(String.valueOf("-1"));
        bw.flush();
    }
}