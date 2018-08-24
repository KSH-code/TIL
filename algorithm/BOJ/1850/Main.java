import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1850
 * BOJ 백준온라인져지 1850 최대공약수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        for (long i = 0, c = v(a, b); i < c; i++) bw.write('1');
        bw.flush();
    }
    private static long v (long a, long b) {
        if (b == 0) return a;
        return v(b, a % b);
    }
}
