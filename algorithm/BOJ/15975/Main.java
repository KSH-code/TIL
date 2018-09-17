import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15975
 * BOJ 백준온라인져지 15975 화살표 그리기 풀이
 */
public class Main {
    static class Node implements Comparable<Node> {
        public int x, color;
        public Node (int x, int color) {
            this.x = x;
            this.color = color;
        }
        @Override
        public int compareTo (Node arg) {
            if (this.color == arg.color) {
                return this.x - arg.x;
            }
            return this.color - arg.color;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Node nodes[] = new Node[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());
            nodes[i] = new Node(x, color);
        }
        Arrays.sort(nodes);
        long result = 0;
        for (int i = 0; i < N; i++) {
            int d1 = Integer.MAX_VALUE;
            int d2 = Integer.MAX_VALUE;
            if (i - 1 >= 0 && nodes[i - 1].color == nodes[i].color) d1 = Math.abs(nodes[i].x - nodes[i - 1].x);
            if (i + 1 < N && nodes[i + 1].color == nodes[i].color) d2 = Math.abs(nodes[i].x - nodes[i + 1].x);
            if (d1 == Integer.MAX_VALUE && d2 == Integer.MAX_VALUE) continue;
            result += Math.min(d1, d2);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}