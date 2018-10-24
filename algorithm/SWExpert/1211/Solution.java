import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14BgD6AEECFAYh&categoryId=AV14BgD6AEECFAYh&categoryType=CODE
 * 1211. [S/W 문제해결 기본] 2일차 - Ladder2
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = 10;
        for (int z = 1; z <= testcase; z++) {
            br.readLine();
            int minCount = Integer.MAX_VALUE;
            boolean map[][] = new boolean[100][100];
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    map[i][j] = st.nextToken().equals("1");
                }
            }
            int result = 0;
            int map2[][] = new int[100][100];
            for (int i = 0; i < 100; i++) {
                if (!map[0][i]) continue;
                int x = 0;
                int y = i;
                int cnt = 0;
                while (x < 100) {
                    map2[x][y] = i + 1;
                    int a = 0;
                    if (y - 1 >= 0) {
                        if (map[x][y - 1] && map2[x][y - 1] != i + 1) {
                            y--;
                            a++;
                        }
                    }
                    if (a == 0 && y + 1 < 100) {
                        if (map[x][y + 1] && map2[x][y + 1] != i + 1) {
                            a++;
                            y++;
                        }
                    }
                    if (a == 0) x++;
                    cnt++;
                }
                if (minCount >= cnt) {
                    result = i;
                    minCount = cnt;
                }
            }
            bw.write("#" + z + " " + result + "\n");
        }
        bw.flush();
    }
}