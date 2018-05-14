import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1654
 * BOJ 백준온라인져지 1654 랜선 자르기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int K = Integer.parseInt(str1[0]);
        int N = Integer.parseInt(str1[1]);
        int lanArray[] = new int[K];
        for (int i = 0; i < K; i++) {
            lanArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lanArray);
        long l = 1;
        long r = lanArray[K - 1];
        while (l <= r) {
            long mid = (l + r) / 2;
            long remain = 0;
            for (int i = 0; i < K; i++) {
                remain += lanArray[i] / mid;
            }
            if (remain >= N) l = mid + 1;
            else r = mid - 1;
        }
        bw.write(String.valueOf(r));
        bw.flush();
    }
}