import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2644
 * BOJ 백준온라인져지 2644 촌수계산 풀이
 */
public class Main {
    static class Vertex implements Comparable<Vertex> {
        public int s, w;
        public Vertex (int s, int w){
            this.s = s;
            this.w = w;
        }
        @Override
        public int compareTo (Vertex arg){
            return this.w - arg.w;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        ArrayList<Integer> edges[] = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) edges[i] = new ArrayList<>();
        int m = Integer.parseInt(br.readLine());
        PriorityQueue<Vertex> q = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            edges[x].add(y);
            edges[y].add(x);
        }
        q.offer(new Vertex(s, 0));
        boolean visited[] = new boolean[N + 1];
        int result = -1;
        while (!q.isEmpty()) {
            Vertex v = q.poll();
            int curS = v.s;
            if (visited[curS]) continue;
            if (curS == e) {
                result = v.w;
                break;
            }
            visited[curS] = true;
            for (int i = 0; i < edges[curS].size(); i++) {
                q.offer(new Vertex(edges[curS].get(i), v.w + 1));
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
