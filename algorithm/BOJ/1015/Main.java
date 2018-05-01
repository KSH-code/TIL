import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1015
 * BOJ 백준온라인져지 1015 수열 정렬 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static class Number {
        public int n, idx;
        public Number (int n, int idx) {
            this.n = n;
            this.idx = idx;
        }
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        Number A[] = new Number[N];
        for (int i = 0; i < N; i++) {
            A[i] = new Number(Integer.parseInt(str1[i]), i);
        }
        int B[] = new int[N];
        for (int i = 0; i < N; i++) {
            int min = A[0].n;
            int minIdx = 0;
            for (int j = 1; j < N; j++) {
                if (A[minIdx].n > A[j].n) {
                    min = A[j].n;
                    minIdx = j;
                }
            }
            B[i] = minIdx;
            A[minIdx].n = 212121;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i].idx == B[j]) bw.write(j + " ");
            }
        }
        bw.flush();
    }
}