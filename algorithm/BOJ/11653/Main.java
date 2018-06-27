import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11653
 * BOJ 백준온라인져지 11653 소인수분해 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                N /= i;
                bw.write(String.valueOf(i--));
                bw.write("\n");
            }
        }
        if (N > 0) bw.write(String.valueOf(N));
        bw.flush();
    }
}
