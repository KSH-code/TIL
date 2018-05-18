import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/14563
 * BOJ 백준온라인져지 14563 완전수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str1[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(str1[i]);
            switch (n) {
                case 6:
                case 28:
                case 496:
                case 8128:
                    bw.write("Perfect\n");
                    break;
                default:
                    int r = 0;
                    for (int j = 1; j <= n / 2; j++) {
                        if (n % j == 0) r += j;
                    }
                    if (r < n) bw.write("Deficient\n");
                    else bw.write("Abundant\n");
                    break;
            }
        }
        bw.flush();
    }
}