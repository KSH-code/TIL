import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1003
 * BOJ 백준온라인져지 1003 피보나치 함수 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int x[] = new int[41];
        int y[] = new int[41];
        x[0] = 1;
        y[1] = 1;
        for (int i = 2; i < 41; i++) {
            x[i] = x[i - 1] + x[i - 2];
            y[i] = y[i - 1] + y[i - 2];
        }
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(x[n] + " " + y[n]);
            bw.write("\n");
        }
        bw.flush();
    }
}