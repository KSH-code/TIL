import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/contest/problem/11051
 * BOJ 백준온라인져지 11051 이항 계수 2 풀이
 */
public class Main {

    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        arr = new int[N + 1][K + 1];

        bw.write(String.valueOf(r(N, K)));

        bw.flush();
    }
    private static int r (int n, int k) {
      if (n == k || k == 0) return 1;
      if (arr[n][k] > 0) return arr[n][k];
      return arr[n][k] = (r(n - 1, k - 1) + r(n - 1, k)) % 10007;
    }
}