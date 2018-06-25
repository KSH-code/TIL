import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10991
 * BOJ 백준온라인져지 10991 별 찍기 - 16 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) bw.write(" ");
            for (int j = 1; j <= i; j++) bw.write("* ");
            bw.write("\n");
        }
        bw.flush();
    }
}
