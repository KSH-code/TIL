import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15967
 * BOJ 백준온라인져지 15967 에바쿰 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q1 = Integer.parseInt(st.nextToken());
        int Q2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long arr[] = new long[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        int j = 0;
        for (int i = 0; i < Q2; i++) {
            st = new StringTokenizer(br.readLine());
            int s = 0;
            int e = 0;
            int n = 0;
            int m = 0;
            int l = 0;
            if (st.nextToken().equals("2")) {
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
                l = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                st.nextToken();
            }
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            long w = 0;
            if (n < s && m >= s) {
                if (m < e) {
                    w = (m - s + 1) * l;
                } else {
                    w = (e - s + 1) * l;
                }
            } else if (n >= s) {
                if (m < e) {
                    w = (m - s + 1) * l;
                } else {
                    w = (e - n + 1) * l;
                }
            }
            w += arr[e] - arr[s - 1];
            bw.write(String.valueOf(w));
            bw.write("\n");
        }
        bw.flush();
    }
}