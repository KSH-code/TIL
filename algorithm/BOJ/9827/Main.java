import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/9827
 * BOJ 백준온라인져지 9827 아즈텍 피라미드 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = 1;
        int h = 1;
        int sum = 1;
        while (sum <= N) {
            n += h * 4;
            h++;
            sum += n;
        }
        bw.write(String.valueOf(h - 1));
        bw.flush();
    }
}