import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10819
 * BOJ 백준온라인져지 10819 차이를 최대로 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int arr[] = new int[8];
    private static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, bruteforce(1 << i, arr[i]));
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
    private static int bruteforce (int check, int cur) {
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (((1 << i) & check) > 0) continue;
            max = Math.max(max, bruteforce(check | (1 << i), arr[i]) + Math.abs(cur - arr[i]));
        }
        return max;
    }
}
