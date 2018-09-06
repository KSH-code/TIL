import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10990
 * BOJ 백준온라인져지 10990 별 찍기 - 15 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) bw.write(" ");
            bw.write("*");
            if (i > 1) {
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) bw.write(" ");
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}