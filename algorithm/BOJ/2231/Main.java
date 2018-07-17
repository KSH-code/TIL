import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2231
 * BOJ 백준온라인져지 2231 분해합 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            if (N == i + sum(i)) {
                System.out.println(i);
                return;
            }
        }
        bw.write("0");
        bw.flush();
    }
    private static int sum (int x) {
        if (x < 10) return x;
        return x % 10 + sum(x / 10);
    }
}
