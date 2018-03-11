import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/15562
 * BOJ 백준온라인져지 15562 네트워크 풀이
 */
public class Main {
    static class Network implements Comparator<Network> {
        @Override
        public int compare(Network x, Network y) {
            if (x.count <= y.count) {
                return -1;
            } else {
                return 1;
            }
        }
        public int next, count;
        public Network (int n, int c) {
            this.next = n;
            this.count = c;
        }
    }
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Comparator<Network> comparator = new Network(0, 0);
        PriorityQueue<Network> pq = new PriorityQueue<>(comparator);
        
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            String str2[] = br.readLine().split(" ");
            int A = Integer.parseInt(str2[0]);
            int B = Integer.parseInt(str2[1]);
            if (A == 1) {
                pq.add(new Network(B, 1));
            } else {
                edges.get(A).add(B);
            }
        }
        while (pq.size() > 0) {
            Network network = pq.remove();
            int cur = network.next;
            int cur2 = network.count;
            if (cur == N) {
                bw.write(String.valueOf(M - cur2 - 1));
                break;
            }
            for (int i = 0; i < edges.get(cur).size(); i++) {
                if (cur < edges.get(cur).get(i)) {
                    pq.add(new Network(edges.get(cur).get(i), cur2 + 1));
                }
            }
        }
        bw.flush();
    }
}