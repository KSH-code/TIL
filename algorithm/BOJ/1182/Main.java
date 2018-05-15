import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1182
 * BOJ 백준온라인져지 1182 부분집합의 합 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int arr[];
    private static int N, S, result = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        S = Integer.parseInt(str1[1]);
        String str2[] = br.readLine().split(" ");
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        bruteforce(0, 0, 0);
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static void bruteforce (int sum, int i, int check) {
        if (i == N) {
            if (sum == S && check > 0) result++;
            return;
        }
        bruteforce(sum + arr[i], i + 1, check + 1);
        bruteforce(sum, i + 1, check);
    }
}