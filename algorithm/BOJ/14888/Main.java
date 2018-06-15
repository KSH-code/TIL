import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/14888
 * BOJ 백준온라인져지 14888 연산자 끼워넣기 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int arr[];
    private static int operators[] = new int[4];
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) operators[i] = Integer.parseInt(st.nextToken());
        dfs(arr[0], 1);
        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(String.valueOf(min));
        bw.flush();
    }
    private static void dfs (int sum, int idx) {
        if (idx == arr.length) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
        }
        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0: dfs(sum + arr[idx], idx + 1); break;
                    case 1: dfs(sum - arr[idx], idx + 1); break;
                    case 2: dfs(sum * arr[idx], idx + 1); break;
                    case 3: dfs(sum / arr[idx], idx + 1); break;
                }
                operators[i]++;
            }
        }
    }
}
