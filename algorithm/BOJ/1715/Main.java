import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1715
 * BOJ 백준온라인져지 1715 카드 정렬하기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }
        while (pq.size() >= 2) {
            int temp = pq.poll() + pq.poll();
            pq.offer(temp);
            sum += temp;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}