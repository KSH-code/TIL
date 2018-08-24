import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11966
 * BOJ 백준온라인져지 11966 2의 제곱인가? 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int f = 1;
        while (f < N) f *= 2;
        bw.write(f == N ? '1' : '0');
        bw.flush();
    }
}
