import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12755
 * BOJ 백준온라인져지 12755 다음수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        while (N > 0) {
            i++;
            String str = String.valueOf(i);
            N -= str.length();
            if (N <= 0) {
                bw.write(str.charAt(str.length() - 1 + N));
            }
        }
        bw.flush();
    }
}