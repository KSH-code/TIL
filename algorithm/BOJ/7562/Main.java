import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7562
 * BOJ 백준온라인져지 7562 나이트의 이동 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int xxxx[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
    private static int yyyy[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int z = 0; z < T; z++) {
            int l = Integer.parseInt(br.readLine());
            boolean isVisited[][] = new boolean[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());
            Queue<Integer> q = new LinkedList<>();
            q.offer(sx * l + sy);
            isVisited[sx][sy] = true;
            while (!q.isEmpty()) {
                int curP = q.poll();
                int curY = curP % l;
                int curX = curP / l % l;
                int curW = curP / l / l;
                if (curX == ex && curY == ey) {
                    bw.write(String.valueOf(curW));
                    bw.write("\n");
                    break;
                }
                for (int i = 0; i < 8; i++) {
                    int thereX = curX + xxxx[i];
                    int thereY = curY + yyyy[i];
                    if (thereX < 0 || thereY < 0 || thereX >= l || thereY >= l || isVisited[thereX][thereY]) continue;
                    isVisited[thereX][thereY] = true;
                    q.offer((curW + 1) * l * l + thereX * l + thereY);
                }
            }
        }
        bw.flush();
    }
}
