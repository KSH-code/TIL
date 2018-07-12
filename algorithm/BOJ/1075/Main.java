import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1075
 * BOJ 백준온라인져지 1075 나누기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        N = N / 100 * 100 - 1;
        for (int i = 0; i < 100; i++) {
            N += 1;
            if (N % F == 0) {
                bw.write(String.valueOf(N % 100 / 10));
                bw.write(String.valueOf(N % 10));
                break;
            }
        }
        bw.flush();
    }
}
