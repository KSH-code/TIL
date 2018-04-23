import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2592
 * BOJ 백준온라인져지 2592 대표값 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[1001];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            sum += N;
            arr[N]++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 1001; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        bw.write(sum / 10 + "\n");
        bw.write(String.valueOf(maxIdx));
        bw.flush();
    }
}