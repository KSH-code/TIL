import java.util.*;
import java.io.*;

/**
 * https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE
 * 1954. 달팽이 숫자
 */
public class Solution {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int z = 1; z <= testcase; z++) {
            int N = Integer.parseInt(br.readLine());
            int arr[][] = new int[N][N];
            int n = 1;
            int d = 0;
            int x = 0;
            int y = -1;
            int xxxx[] = { 0, -1, 0, 1 };
            int yyyy[] = { 1, 0, -1, 0 };
            while (N * N >= n) {
                int tempX = x + xxxx[d];
                int tempY = y + yyyy[d];
                if (tempX < 0 || tempX >= N || tempY < 0 || tempY >= N || arr[tempX][tempY] != 0) {
                    d = (d + 1) % 4;
                    continue;
                }
                x = tempX;
                y = tempY;
                arr[x][y] = n++;
            }
            bw.write("#" + z + "\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    bw.write(arr[i][j] + " ");
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}