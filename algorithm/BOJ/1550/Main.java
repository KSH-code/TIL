import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1550
 * BOJ 백준온라인져지 1550 16진수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, M;
    private static boolean visited[], edges[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split("");
        int result = 0;
        int c = 1;
        for (int i = 0; i < str1.length; i++) {
            int temp = str1[str1.length - i - 1].charAt(0);
            if (temp >= 'A' && temp <= 'F') temp = temp - 'A' + 10;
            else temp = temp - '0';
            result += temp * c;
            c *= 16;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
