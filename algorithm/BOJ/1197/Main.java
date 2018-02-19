import java.io.*;
import java.util.*;

/**
 * 이해와 수정 필요함
 * 1197
 */
class Node implements Comparable<Node> {
    int x, y; 
    // x는 v -> x 일때의 x이다.
    // y는 가중치

    public Node() {}

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Node arg0) { // 우선순위 체크 PriorityQueue
        return this.y - arg0.y;
    }
}

public class Main {
    int v[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1[] = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);

        ArrayList<Node> g[] = new ArrayList[10005];
        PriorityQueue<Node> pq = new PriorityQueue<Node>(); // 우선순위 큐
        // 가중치가 높을수록 먼저 나간다.

        for (int i = 1; i <= n; i++)
            g[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str2[] = br.readLine().split(" ");
            int y = Integer.parseInt(str2[0]);
            int x = Integer.parseInt(str2[1]);
            int z = Integer.parseInt(str2[2]);
            // 양방향 리스트
            g[x].add(new Node(y, z));
            g[y].add(new Node(x, z));
        }

        int s = 1, ans = 0;
        int v[] = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            v[s] = 1;
            for (int j = 0; j < g[s].size(); j++) {
                pq.add(g[s].get(j));
            }
            while (v[pq.element().x] == 1) {
                pq.remove();
            }
            ans += pq.element().y;
            s = pq.peek().x;
            pq.remove();
        }
        System.out.println(ans);
    }
}