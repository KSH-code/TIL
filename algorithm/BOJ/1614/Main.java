import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1614
 * BOJ 백준온라인져지 1614 영식이의 손가락 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long cnt = Integer.parseInt(br.readLine());
        long n = N - 1;
        if (cnt > 0) {
            if (N % 4 == 1) n += 8 * cnt;
            else n += cnt / 2 * 8 + cnt % 2 * (8 - (N - 1) * 2);
        }
        bw.write(String.valueOf(n));
        bw.flush();
    }
}