import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1062
 * BOJ 백준온라인져지 1062 가르침 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int check = 0, N, K, result = 0;
    private static String words[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        words = new String[N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            str = str.substring(4, str.length());
            str = str.substring(0, str.length() - 4);
            words[i] = str;
        }
        K -= 5;
        if (K >= 0) {
            check |= 1 << 'a' - 'a';
            check |= 1 << 'n' - 'a';
            check |= 1 << 't' - 'a';
            check |= 1 << 'c' - 'a';
            check |= 1 << 'i' - 'a';
            dfs(K, 1);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void dfs (int x, int k) {
        if (x == 0) {
            int cnt = N;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if ((check & (1 << words[i].charAt(j) - 'a')) == 0) {
                        cnt--;
                        break;
                    }
                }
            }
            result = Math.max(result, cnt);
            return;
        }
        if (k > 25) return;
        if ((check & (1 << k)) == 0) {
            check |= 1 << k;
            dfs(x - 1, k + 1);
            check -= 1 << k;
        }
        dfs(x, k + 1);
    }
}