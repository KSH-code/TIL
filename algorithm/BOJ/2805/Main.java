import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2805
 * BOJ 백준온라인져지 2805 나무 자르기 풀이
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
        int maxHeight = 0;
        for (int i = 0; i < N; i++) maxHeight = Math.max(maxHeight, arr[i] = Integer.parseInt(st.nextToken()));
        int l = 1;
        int r = maxHeight;
        int m = (l + r) / 2;
        while (l <= r) {
            long sum = 0;
            for (int i = 0; i < N; i++) sum += Math.max(0, arr[i] - m);
            if (sum < M) r = m - 1;
            else l = m + 1;
            m = (l + r) / 2;
        }
        bw.write(String.valueOf(r));
        bw.flush();
    }
}
