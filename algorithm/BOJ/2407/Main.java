import java.util.*;
import java.io.*;
import java.math.*;

/**
 * https://www.acmicpc.net/problem/2407
 * BOJ 백준온라인져지 2407 조합 풀이
 */
public class Main {

    private static BigInteger[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);

        arr = new BigInteger[N + 1][K + 1];

        bw.write(String.valueOf(r(N, K)));

        bw.flush();
    }

    private static BigInteger r (int n, int k) {
      if (n == k || k == 0) return BigInteger.ONE;
      if (arr[n][k] != null) return arr[n][k];
      arr[n][k] = new BigInteger("0");
      return arr[n][k] = arr[n][k].add(r(n - 1, k - 1)).add(r(n - 1, k));
    }
}