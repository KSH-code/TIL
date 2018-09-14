import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2661
 * BOJ 백준온라인져지 2661 좋은수열 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static StringBuilder str = new StringBuilder().append(1);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(1);
        bw.flush();
    }
    private static boolean dfs (int x) throws IOException {
        if (x == N) {
            bw.write(str.toString());
            return true;
        }
        x++;
        for (int i = 1; i <= 3; i++) {
            str.append(i);
            boolean isGood = true;
            for (int j = 1; j * 2 <= x; j++) {
                String tempA = str.substring(x - j * 2, x - j);
                String tempB = str.substring(x - j, x);
                if (tempA.equals(tempB)) {
                    isGood = false;
                    break;
                }
            }
            if (isGood && dfs(x)) return true;
            str.deleteCharAt(x - 1);
        }
        return false;
    }
}