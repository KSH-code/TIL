import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1673
 * BOJ 백준온라인져지 1673 치킨 쿠폰 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int result = N;
            while (N >= K) {
                result += N / K;
                N = N / K + N % K;
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }
        bw.flush();
    }
}