import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15708
 * BOJ 백준온라인져지 15708 미네크래프트 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        long T = Long.parseLong(str1[1]);
        long P = Long.parseLong(str1[2]);
        String str2[] = br.readLine().split(" ");
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(str2[i]);
            sum += K;
            pq.offer(-K);
            while (sum > T - i * P) {
                if (pq.size() == 0) break;
                sum += pq.poll();
            }
            max = Math.max(max, pq.size());
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}