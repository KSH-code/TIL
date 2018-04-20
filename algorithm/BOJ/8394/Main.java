import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/8394
 * BOJ 백준온라인져지 8394 악수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 1, y = 1;
        for (int i = 2; i <= N; i++) {
            int temp = x;
            x = (x + y) % 10;
            y = temp;
        }
        bw.write(String.valueOf(x));
        bw.flush();
    }
}