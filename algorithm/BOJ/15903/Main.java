import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15903
 * BOJ 백준온라인져지 15903 카드 합체 놀이 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) pq.offer(Long.parseLong(st.nextToken()));
        while (M-- > 0) {
            long a = pq.poll();
            long b = pq.poll();
            pq.offer(a + b);
            pq.offer(a + b);
        }
        long result = 0;
        while (!pq.isEmpty()) result += pq.poll();
        bw.write(String.valueOf(result));
        bw.flush();
    }
}