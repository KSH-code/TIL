import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1194
 * BOJ 백준온라인져지 1194 달이 차오른다, 가자. 풀이
 */
public class Main {
    static class State {
        public int x, y, z;
        public State (int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    private static int xxxx[] = { 0, -1, 0, 1 };
    private static int yyyy[] = { -1, 0, 1, 0 };
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        char map[][] = new char[N][M];
        Queue<State> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String str2[] = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = str2[j].charAt(0);
                if (map[i][j] == '0') {
                    q.offer(new State(i, j, 0));
                }
            }
        }
        int visited[][][] = new int[N][M][1 << 6];
        while (q.size() > 0) {
            State state = q.poll();
            int preX = state.x;
            int preY = state.y;
            int z = state.z;
            if (map[preX][preY] == '1') {
                System.out.println(visited[preX][preY][z]);
                return;
            }
            for (int i = 0; i < 4; i++) {
                int curX = preX + xxxx[i];
                int curY = preY + yyyy[i];
                if (curX < 0 || curY < 0 || curX >= N || curY >= M || visited[curX][curY][z] > 0 || map[curX][curY] == '#') continue;
                if (map[curX][curY] >= 'a' && map[curX][curY] <= 'f') {
                    int curZ = z | (1 << map[curX][curY] - 'a');
                    visited[curX][curY][curZ] = visited[preX][preY][z] + 1;
                    q.offer(new State(curX, curY, curZ));
                } else if (map[curX][curY] >= 'A' && map[curX][curY] <= 'F') {
                    if (((1 << map[curX][curY] - 'A') & z) > 0) {
                        visited[curX][curY][z] = visited[preX][preY][z] + 1;
                        q.offer(new State(curX, curY, z));
                    }
                } else {
                    visited[curX][curY][z] = visited[preX][preY][z] + 1;
                    q.offer(new State(curX, curY, z));
                }
            }
        }
        bw.write("-1");
        bw.flush();
    }
}