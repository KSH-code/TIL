import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1182
 * BOJ 백준온라인져지 1182 부분집합의 합 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int memoization[] = new int[16];
    private static int arr[][];
    private static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String str2[] = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str2[0]);
            arr[i][1] = Integer.parseInt(str2[1]);
        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] + i <= N) memoization[i] = arr[i][1];
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j][0] + j <= i) temp = Math.max(memoization[j], temp);
            }
            result = Math.max(memoization[i] += temp, result);
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}