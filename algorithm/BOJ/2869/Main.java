import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2869
 * BOJ 백준온라인져지 2869 달팽이는 올라가고 싶다 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken()) - A;
        bw.write(String.valueOf((int)Math.ceil(1 + (double) V / (A - B))));
        bw.flush();
    }
}