import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10162
 * BOJ 백준온라인져지 10162 전자레인지 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = N / 300;
        N %= 300;
        int B = N / 60;
        N %= 60;
        int C = N / 10;
        N %= 10;
        if (N > 0) bw.write("-1");
        else {
            bw.write(String.valueOf(A));
            bw.write(" ");
            bw.write(String.valueOf(B));
            bw.write(" ");
            bw.write(String.valueOf(C));
        }
        bw.flush();
    }
}
