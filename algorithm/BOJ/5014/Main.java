import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5014
 * BOJ 백준온라인져지 5014 스타트링크 풀이
 */
public class Main {
    static class Position implements Comparable<Position> {
        public int x, w;
        public Position (int x, int w) {
            this.x = x;
            this.w = w;
        }
        public int compareTo (Position arg0) {
            return this.w - arg0.w;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        boolean visited[] = new boolean[F + 1];
        PriorityQueue<Position> pq = new PriorityQueue<>();
        pq.offer(new Position(S, 0));
        visited[S] = true;
        while (!pq.isEmpty()) {
            Position p = pq.poll();
            if (p.x == G) {
                System.out.println(p.w);
                return;
            }
            int w = p.w + 1;
            int u = p.x + U;
            if (u <= F && !visited[u]) {
                pq.offer(new Position(u, w));
                visited[u] = true;
            }
            int d = p.x - D;
            if (d >= 1 && !visited[d]) {
                pq.offer(new Position(d, w));
                visited[d] = true;
            }
        }
        bw.write("use the stairs");
        bw.flush();
    }
}
