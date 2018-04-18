import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/6986
 * BOJ 백준온라인져지 6986 절사평균 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        double arr[] = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 0; i + 2 * K < N; i++) {
            sum += arr[i + K];
        }
        System.out.println(String.format("%.3g", sum / (N - 2 * K) + 1e-6));
        sum += (arr[K] + arr[N - 1 - K]) * K;
        System.out.println(String.format("%.3g", sum / N + 1e-6));
        bw.flush();
    }
}