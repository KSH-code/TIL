import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15QRX6APsCFAYD&categoryId=AV15QRX6APsCFAYD&categoryType=CODE
 * 1249. [S/W 문제해결 응용] 4일차 - 보급로
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int z = 1; z <= testcase; z++) {
            int N = Integer.parseInt(br.readLine());
            int map[][] = new int[N][N];
            int pointMap[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    pointMap[i][j] = 123456789;
                    map[i][j] = str.charAt(j) - '0';
                }
            }
            Queue<Integer> q = new LinkedList<Integer>();
            q.offer(0);
            int result = 123456789;
            int xxxx[] = { -1, 0, 1, 0 };
            int yyyy[] = { 0, 1, 0, -1 };
            pointMap[0][0] = 0;
            while (!q.isEmpty()) {
                int curPosition = q.poll();
                int x = curPosition / 1000;
                int y = curPosition % 1000;
                int point = pointMap[x][y];
                for (int i = 0; i < 4; i++) {
                    int curX = x + xxxx[i];
                    int curY = y + yyyy[i];
                    if (curX < 0 || curY < 0 || curX >= N || curY >= N) continue;
                    int curPoint = point + map[curX][curY];
                    if (pointMap[curX][curY] <= curPoint) continue;
                    pointMap[curX][curY] = curPoint;
                    if (curX == N - 1 && curY == N - 1) result = curPoint;
                    q.offer(curX * 1000 + curY);
                }
            }
            bw.write("#" + z + " " + result + "\n");
        }
        bw.flush();
    }
}