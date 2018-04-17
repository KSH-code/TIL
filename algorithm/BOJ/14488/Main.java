import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/14488
 * BOJ 백준온라인져지 14488 준오는 급식충이야!! 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        double T = Double.parseDouble(str1[1]);
        long position[] = new long[N];
        String str2[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            position[i] = Long.parseLong(str2[i]);
        }
        double min = -1000000000 * 1200000000;
        double max = 1000000000 * 1200000000;
        String str3[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int velocity = Integer.parseInt(str3[i]);
            min = Math.max(min, velocity * -T + position[i]);
            max = Math.min(max, velocity * T + position[i]);
        }
        if (min > max + 1e-08) bw.write("0");
        else bw.write("1");
        bw.flush();
    }
}