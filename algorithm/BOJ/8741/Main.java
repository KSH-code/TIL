import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/8741
 * BOJ 백준온라인져지 8741 이진수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) bw.write("1");
        for (int i = 1; i < N; i++) bw.write("0");
        bw.flush();
    }
}