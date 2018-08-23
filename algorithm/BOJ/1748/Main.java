import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1748
 * BOJ 백준온라인져지 1748 수 이어 쓰기 1 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long c = 0;
        for (long i = 1; i <= N; i *= 10) {
            c += N - i + 1;
        }
        bw.write(String.valueOf(c));
        bw.flush();
    }
}
