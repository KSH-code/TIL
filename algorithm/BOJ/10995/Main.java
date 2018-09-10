import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10995
 * BOJ 백준온라인져지 10995 별 찍기 - 20 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) bw.write("* ");
                else bw.write(" *");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}