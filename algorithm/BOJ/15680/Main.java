import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/15680
 * BOJ 백준온라인져지 15680 연세대학교 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bw.write(N == 0 ? "YONSEI" : "Leading the Way to the Future");
        bw.flush();
    }
}