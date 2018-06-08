import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/10808
 * BOJ 백준온라인져지 10808 알파벳 개수 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int alpha[] = new int[26];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            bw.write(alpha[i] + " ");
        }
        bw.flush();
    }
}