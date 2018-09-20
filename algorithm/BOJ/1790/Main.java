import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/1790
 * BOJ 백준온라인져지 1790 수 이어 쓰기 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int i = 1;
        for (; i <= N; i++) {
            K -= getLength(i);
            if (K <= 0) break;
        }
        if (K > 0) bw.write("-1");
        else {
            while (K < 0) {
                K++;
                i /= 10;
            }
            bw.write(String.valueOf(i % 10));
        }
        bw.flush();
    }
    private static int getLength (int n) {
        int l = 0;
        while (n > 0) {
            n /= 10;
            l++;
        }
        return l;
    }
}