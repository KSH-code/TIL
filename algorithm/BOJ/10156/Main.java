import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10156
 * BOJ 백준온라인져지 10156 과자 풀이
 */
public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1[] = br.readLine().split( " ");
        int N = Integer.parseInt(str1[0]); 
        int K = Integer.parseInt(str1[1]);
        int F = Integer.parseInt(str1[2]);
        int R = Math.max(N * K - F, 0);
        bw.write(String.valueOf(R));
        bw.flush();
    }
}