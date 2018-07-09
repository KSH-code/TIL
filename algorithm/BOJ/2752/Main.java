import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2752
 * BOJ 백준온라인져지 2752 세수정렬 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (st.hasMoreTokens()) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }
        while (!pq.isEmpty()) {
            bw.write(String.valueOf(pq.poll()));
            bw.write(" ");
        }
        bw.flush();
    }
}
