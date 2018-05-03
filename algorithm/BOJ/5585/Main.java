import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5585
 * BOJ 백준온라인져지 5585 거스름돈 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N = 1000 - N;
        int t[] = {500,100,50,10,5,1};
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            cnt += N / t[i];
            N -= (N / t[i]) * t[i];
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}