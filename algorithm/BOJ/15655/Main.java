import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15655
 * BOJ 백준온라인져지 15655 N과 M (6) 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M, arr[], x = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        go(0, 0);
        bw.flush();
    }
    private static void go (int idx, int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < N; i++) {
                if ((x & (1 << i)) > 0) bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = idx; i < N; i++) {
            if (i + 1 < N && arr[i] == arr[i + 1]) continue;
            x |= 1 << i;
            go(i + 1, cnt + 1);
            x -= 1 << i;
        }
    }
}