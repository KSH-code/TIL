import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/1371
 * BOJ 백준온라인져지 1371 가장 많은 글자 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int alphabet[] = new int[26];
        String str;
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, alphabet[i]);
        }
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == max) {
                bw.write('a' + i);
            }
        }
        bw.flush();
    }
}