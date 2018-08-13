import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2110
 * BOJ 백준온라인져지 2110 공유기 설치 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int l = 1; // 최소거리
        int r = arr[N - 1] - arr[0]; // 최대거리
        while (l <= r) {
            int cnt = 1;
            int m = (l + r) / 2;
            int f = arr[0];
            for (int i = 1; i < N; i++) {
                if (m <= arr[i] - f) {
                    cnt++;
                    f = arr[i];
                }
            }
            if (cnt < C) r = m - 1;
            else l = m + 1;
        }
        bw.write(String.valueOf(r));
        bw.flush();
    }
}