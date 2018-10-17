import java.util.*;
import java.io.*;

public class Main {
    static class Node implements Comparable<Node> {
        public int st, et;
        public Node (int st, int et) {
            this.st = st;
            this.et = et;
        }
        @Override
        public int compareTo (Node arg) {
            return this.st - arg.st;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int stt = Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));
            String e = st.nextToken();
            int et = Integer.parseInt(e.substring(0, 2)) * 60 + Integer.parseInt(e.substring(3, 5));
            pq.offer(new Node(stt, et));
        }
        PriorityQueue<Integer> ets = new PriorityQueue<>();
        int resultSt = 0;
        int resultEt = 0;
        int c = 0;
        while (!pq.isEmpty()) {
            Node n = pq.poll();
            while (!ets.isEmpty() && ets.peek() <= n.st) ets.poll();
            ets.offer(n.et);
            if (c < ets.size()) {
                resultSt = n.st;
                resultEt = ets.peek();
                c = ets.size();
            } else if (c == ets.size() && resultEt == n.st) {
                resultEt = ets.peek();
            }
        }
        bw.write(String.valueOf(c));
        bw.write("\n");
        bw.write(t(resultSt / 60) + ":" + t(resultSt % 60) + " " + t(resultEt / 60) + ":" + t(resultEt % 60));
        bw.flush();
    }
    private static String t (int a) {
        if (a < 10) return "0" + a;
        return String.valueOf(a);
    }
}
