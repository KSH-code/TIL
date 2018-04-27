import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11944
 * BOJ 백준온라인져지 11944 NN 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < str1[0].length(); j++) {
                if (M == 0) {
                    i = N;
                    break;
                }
                bw.write(str1[0].charAt(j));
                M--;
            }
        }
        bw.flush();
    }
}