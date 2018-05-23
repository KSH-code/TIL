import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12738
 * BOJ 백준온라인져지 12738 가장 긴 증가하는 부분 수열 3 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        int arr[] = new int[N];
        arr[0] = Integer.parseInt(str1[0]);
        int size = 1;
        for (int i = 1; i < N; i++) {
            int h = Integer.parseInt(str1[i]);
            if (arr[size - 1] < h) arr[size++] = h;
            else {
                int l = 0;
                int r = size;
                int m = 0;
                while (l < r) {
                    m = (l + r) / 2;
                    if (arr[m] < h) l = m + 1;
                    else r = m;
                }
                arr[r] = h;
            }
        }
        bw.write(String.valueOf(size));
        bw.flush();
    }
}