import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/16169
 * BOJ 백준온라인져지 16169 수행 시간 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int arr[][], indegree[], r[];
    private static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[N][2];
        indegree = new int[N];
        r = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            r[i] = arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][0] == arr[j][0] - 1) indegree[j]++;
            }
        }
        for (int i = 0; i < N; i++) {
            if (indegree[i] == 0) dfs(i);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void dfs (int n) {
        result = Math.max(result, r[n]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[n][0] == arr[i][0] - 1) {
                --indegree[i];
                r[i] = Math.max(r[i], arr[i][1] + (int) Math.pow(n - i, 2) + r[n]);
                if (indegree[i] == 0) {
                    dfs(i);
                }
            }
        }
    }
}