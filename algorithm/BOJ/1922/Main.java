import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1922
 * BOJ 백준온라인져지 1922 네트워크 연결 풀이
 */
public class Main {
    static class Node implements Comparable<Node> {
        public int x, w;
        public Node (int x, int w) {
            this.x = x;
            this.w = w;
        }
        @Override
        public int compareTo (Node arg) {
            return this.w - arg.w;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        LinkedList<Node> edges[] = new LinkedList[N + 1];
        for (int i = 1; i <= N; i++) edges[i] = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges[s].add(new Node(e, w));
            edges[e].add(new Node(s, w));
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean isVisited[] = new boolean[N + 1];
        for (Node node : edges[1]) pq.offer(node);
        isVisited[1] = true;
        int result = 0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (isVisited[node.x]) continue;
            isVisited[node.x] = true;
            result += node.w;
            for (Node tempNode : edges[node.x]) if (!isVisited[tempNode.x]) pq.offer(tempNode);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
