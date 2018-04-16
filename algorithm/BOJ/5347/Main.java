import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5347
 * BOJ 백준온라인져지 5347 LCM 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str1[] = br.readLine().split(" ");
            Long A = Long.parseLong(str1[0]);
            Long B = Long.parseLong(str1[1]);
            bw.write((A * B / gcm(A, B)) + "\n");
        }
        bw.flush();
    }
    private static long gcm (long a, long b) {
        long mod;
        while ((mod = a % b) > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        return b;
    }
}