import java.util.*;
import java.io.*;

/**
 * https://www.acmicpc.net/problem/12780
 * BOJ 백준온라인져지 12780 원피스 풀이
 */
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int cnt = 0;
        for (int i = 0; i < str1.length(); i++) {
            boolean no = false;
            for (int j = 0; j < str2.length(); j++) {
                if (i + j >= str1.length() || str1.charAt(i + j) != str2.charAt(j)) {
                    no = true;
                    break;
                }
            }
            if (!no) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}