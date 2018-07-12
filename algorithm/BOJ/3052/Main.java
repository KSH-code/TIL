import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/3052
 * BOJ 백준온라인져지 3052 나머지 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean check[] = new boolean[42];
        int result = 0;
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            if (!check[N % 42]) result++;
            check[N % 42] = true;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
