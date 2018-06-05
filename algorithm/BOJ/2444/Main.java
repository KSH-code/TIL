import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2444
 * BOJ 백준온라인져지 2444 별찍기 - 7 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) bw.write(" ");
            for (int j = 1; j <= 2 * i - 1; j++) bw.write("*");
            bw.write("\n");
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) bw.write(" ");
            for (int j = 1; j <= 2 * N - ((i - 1) * 2 + 1); j++) bw.write("*");
            bw.write("\n");
        }
        bw.flush();
    }
}