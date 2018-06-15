import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2003
 * BOJ 백준온라인져지 2003 수들의 합 2 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int sum = 0;
        int l = 0, r = 0;
        int result = 0;
        while (true) {
            if (sum >= M) sum -= arr[l++];
            else if (r == N) break;
            else sum += arr[r++];
            if (sum == M) result++;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
