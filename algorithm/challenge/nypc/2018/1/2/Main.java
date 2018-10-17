import java.util.*;
import java.io.*;

public class Main {
    static class Node implements Comparable<Node> {
        public String team;
        public int time;
        public Node (String team, int time) {
            this.team = team;
            this.time = time;
        }
        @Override
        public int compareTo (Node arg) {
            return this.time - arg.time;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            String t = br.readLine();
            PriorityQueue<Node> pq = new PriorityQueue<>();
            for (int i = 0; i < 8; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String team = st.nextToken();
                String tempTime = st.nextToken();
                int time = Integer.parseInt(tempTime.substring(0, 1)) * 6000 + Integer.parseInt(tempTime.substring(2, 4)) * 100 + Integer.parseInt(tempTime.substring(5, 7));
                pq.offer(new Node(team, time));
            }
            if (t.equals("item")) {
                bw.write(String.valueOf(pq.poll().team));
            } else {
                int arr[] = { 8, 6, 5, 4, 3, 2, 1 };
                int r = 0;
                int b = 0;
                Node n = pq.poll();
                String team = n.team;
                int f = n.time;
                if (team.equals("red")) r += 10;
                else b += 10;
                for (int i = 0; i < 7; i++) {
                    n = pq.poll();
                    if (n.time >= f + 1000) break;
                    String tteam = n.team;
                    if (tteam.equals("red")) r += arr[i];
                    else b += arr[i];
                }
                if (r > b) bw.write("red");
                else if (b > r) bw.write("blue");
                else bw.write(team);
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
