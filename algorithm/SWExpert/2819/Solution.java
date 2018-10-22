import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7I5fgqEogDFAXB&categoryId=AV7I5fgqEogDFAXB&categoryType=CODE
 * 2819. 격자판의 숫자 이어 붙이기
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int map[][];
    private static boolean alreadyGo[];
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int z = 1; z <= testcase; z++) {
            count = 0;
            map = new int[4][4];
            alreadyGo = new boolean[10000000];
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    dfs(i, j, map[i][j], 1);
                }
            }
            bw.write("#" + z + " " + count + "\n");
        }
        bw.flush();
    }
    private static int xxxx[] = { -1, 0, 1, 0 };
    private static int yyyy[] = { 0, 1, 0, -1 };
    private static void dfs (int x, int y, int curNumber, int n) {
        if (n == 7) {
            if (alreadyGo[curNumber]) return;
            alreadyGo[curNumber] = true;
            count++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int curX = x + xxxx[i];
            int curY = y + yyyy[i];
            if (curX < 0 || curY < 0 || curX >= 4 || curY >= 4) continue;
            dfs(curX, curY, curNumber * 10 + map[curX][curY], n + 1);
        }
    }
}