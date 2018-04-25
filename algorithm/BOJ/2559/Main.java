import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2559
 * BOJ 백준온라인져지 2559 수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        String str2[] = br.readLine().split(" ");
        int cur = 0;
        for (int i = 0; i < K; i++) {
            cur += Integer.parseInt(str2[i]);
        }
        int max = cur;
        for (int i = K; i < N; i++) {
            cur -= Integer.parseInt(str2[i - K]);
            cur += Integer.parseInt(str2[i]);
            max = Math.max(cur, max);
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}