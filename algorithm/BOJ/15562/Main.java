import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/15562
 * BOJ 백준온라인져지 15562 네트워크 풀이
 */
public class Main {
    private static boolean visited[];
    private static int result = 0;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        int in[] = new int[N + 1];
        int out[] = new int[N + 1];
        for (int i = 0; i < M; i++) {
            String str2[] = br.readLine().split(" ");
            int A = Integer.parseInt(str2[0]);
            int B = Integer.parseInt(str2[1]);
            out[A]++;
            in[B]++;
        }
        result = 0;
        for (int i = 1; i <= N; i++) {
            result += Math.max(0, out[i] - in[i]);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}