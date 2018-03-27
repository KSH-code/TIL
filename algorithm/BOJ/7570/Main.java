import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/7570
 * BOJ 백준온라인져지 7570 줄 세우기 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int N = Integer.parseInt(br.readLine());
        int count[] = new int[N + 1];
        String str1[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(str1[i]);
            count[temp] = count[temp - 1] + 1;
            if (count[temp] > max) max = count[temp];
        }
        bw.write(String.valueOf(N - max));
        bw.flush();
    }
}