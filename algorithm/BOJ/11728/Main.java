import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11728
 * BOJ 백준온라인져지 11728 배열 합치기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            pq.offer(m);
        }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            pq.offer(m);
        }
        while (!pq.isEmpty()) {
            bw.write(pq.poll() + " ");
        }
        bw.flush();
    }
}