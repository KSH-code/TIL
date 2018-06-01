import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/2914
 * BOJ 백준온라인져지 2914 저작권 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int A = Integer.parseInt(str1[0]);
        int I = Integer.parseInt(str1[1]);
        bw.write(String.valueOf(A * (I - 1) + 1));
        bw.flush();
    }
}