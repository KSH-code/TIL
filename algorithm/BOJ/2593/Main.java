import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2593
 * BOJ 백준온라인져지 2593 엘리베이터 풀이
 */
public class Main {
    static class Elevator {
        public int X, Y, Z, cnt;
        public Elevator (int X, int Y, int Z, int cnt) {
            this.X = X;
            this.Y = Y;
            this.Z = Z;
            this.cnt = cnt;
        }
    }
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        String strArray[] = new String[M];
        for (int i = 0; i < M; i++) {
            strArray[i] = br.readLine();
        }
        String str2[] = br.readLine().split(" ");
        int s = Integer.parseInt(str2[1]);
        int e = Integer.parseInt(str2[0]);
        boolean visitied[] = new boolean[M];
        Elevator edges[] = new Elevator[M];
        Queue<Elevator> eq = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            String str3[] = strArray[i].split(" ");
            int X = Integer.parseInt(str3[0]);
            int Y = Integer.parseInt(str3[1]);
            edges[i] = new Elevator(X, Y);
            if (s % Y == X) eq.offer(new Elevator(X, Y, i, 1));
        }
        while (!eq.empty()) {
            Elevator elevator = eq.poll();
            visitied[elevator.Z] = true;
            for (int i = 0; i < M; i++) {
                if (visitied[Z]) continue;
                if (elevator.X )
            }
        }
        bw.flush();
    }
}