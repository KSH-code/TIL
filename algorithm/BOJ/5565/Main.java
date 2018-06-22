import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/5565
 * BOJ 백준온라인져지 5565 영수증 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) N -= Integer.parseInt(br.readLine());
        bw.write(String.valueOf(N));
        bw.flush();
    }
}
