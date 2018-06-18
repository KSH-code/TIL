import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2523
 * BOJ 백준온라인져지 2523 별찍기 - 13 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int j = 1; j <= 2 * N - 1; j++) {
            for (int i = 1; i <= (j < N ? j : 2 * N - j); i++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
