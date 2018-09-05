import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15905
 * BOJ 백준온라인져지 15905 스텔라(STELLA)가 치킨을 선물했어요 풀이
 */
public class Main {
    static class Node implements Comparable<Node> {
        public int c, p;
        public Node (int c, int p) {
            this.c = c;
            this.p = p;
        }
        @Override
        public int compareTo (Node arg) {
            if (arg.c == this.c) return this.p - arg.p;
            return arg.c - this.c;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Node nodes[] = new Node[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            nodes[i] = new Node(c, p);
        }
        Arrays.sort(nodes);
        Node t = nodes[4];
        int result = 0;
        for (int i = 5; i < N; i++) {
            if (t.c == nodes[i].c) result++;
            else break;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}