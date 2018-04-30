import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/11945
 * BOJ 백준온라인져지 11945 뜨거운 붕어빵 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                bw.write(str.charAt(M - j - 1));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}