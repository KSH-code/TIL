import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9663
 * BOJ 백준온라인져지 9663 N-Queen 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int result = 0, N;
    private static int col[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N + 1];
        // (1, 1) (2, 1)
        // (1, 2) (2, 2)
        for (int i = 1; i <= N; i++) {
            col[1] = i; // 첫 번째 가로 칸의 i 번 째 세로칸을 채운다. (1, i)
            dfs(1);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void dfs (int x) {
        if (x == N) {
            result++;
        } else {
            for (int i = 1; i <= N; i++) {
                int temp = x + 1;
                col[temp] = i;
                for (int j = 1; j <= x; j++) {
                    if (col[j] == i || Math.abs(j - temp) == Math.abs(col[j] - i)) { // 대각선, 같은행 확인
                        col[temp] = 0;
                        break;
                    }
                }
                if (col[temp] == i) dfs(temp);
            }
        }
        col[x] = 0;
    }
}
