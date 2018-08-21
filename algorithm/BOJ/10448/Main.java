import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10448
 * BOJ 백준온라인져지 10448 유레카 이론 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int tri[] = new int[50];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 49; i++) tri[i] = i * (i + 1) / 2;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            bw.write(isTrue(Integer.parseInt(br.readLine())) ? "1\n" : "0\n");
        }
        bw.flush();
    }
    private static boolean isTrue (int n) {
        for (int i = 1; i <= 49; i++) {
            for (int j = 1; j <= 49; j++) {
                for (int k = 1; k <= 49; k++) {
                    if (n - tri[i] - tri[j] - tri[k] == 0) return true;
                }
            }
        }
        return false;
    }
}
